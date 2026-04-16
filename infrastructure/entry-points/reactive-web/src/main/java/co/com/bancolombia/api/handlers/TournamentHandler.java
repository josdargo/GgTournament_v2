package co.com.bancolombia.api.handlers;

import co.com.bancolombia.model.tournament.Tournament;
import co.com.bancolombia.usecase.tournament.TournamentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TournamentHandler {

    private final TournamentUseCase useCase;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().body(useCase.findAll(), Tournament.class);
    }

    public Mono<ServerResponse> getById(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.findById(id)
                .flatMap(tournament -> ServerResponse.ok().bodyValue(tournament))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        return request.bodyToMono(Tournament.class)
                .flatMap(useCase::save)
                .flatMap(saved -> ServerResponse.status(HttpStatus.CREATED).bodyValue(saved));
    }

    public Mono<ServerResponse> update(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return request.bodyToMono(Tournament.class)
                .doOnNext(tournament -> tournament.setId(id))
                .flatMap(useCase::update)
                .flatMap(updated -> ServerResponse.ok().bodyValue(updated))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.deleteById(id).then(ServerResponse.noContent().build());
    }
}
