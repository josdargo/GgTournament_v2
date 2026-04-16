package co.com.bancolombia.api.handlers;

import co.com.bancolombia.model.announcement.Announcement;
import co.com.bancolombia.usecase.announcement.AnnouncementUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class AnnouncementHandler {

    private final AnnouncementUseCase useCase;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().body(useCase.findAll(), Announcement.class);
    }

    public Mono<ServerResponse> getById(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.findById(id)
                .flatMap(announcement -> ServerResponse.ok().bodyValue(announcement))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        return request.bodyToMono(Announcement.class)
                .flatMap(useCase::save)

                .flatMap(saved -> ServerResponse.status(HttpStatus.CREATED).bodyValue(saved));
    }

    public Mono<ServerResponse> update(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return request.bodyToMono(Announcement.class)
                .doOnNext(announcement -> announcement.setId(id))
                .flatMap(useCase::update)
                .flatMap(updated -> ServerResponse.ok().bodyValue(updated))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.deleteById(id).then(ServerResponse.noContent().build());
    }
}
