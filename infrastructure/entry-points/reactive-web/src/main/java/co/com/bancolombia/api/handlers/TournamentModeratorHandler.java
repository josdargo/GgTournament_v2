package co.com.bancolombia.api.handlers;

import co.com.bancolombia.model.tournamentmoderator.TournamentModerator;
import co.com.bancolombia.usecase.tournamentmoderator.TournamentModeratorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TournamentModeratorHandler {

    private final TournamentModeratorUseCase useCase;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().body(useCase.findAll(), TournamentModerator.class);
    }

    public Mono<ServerResponse> getById(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.findById(id)
                .flatMap(tournamentModerator -> ServerResponse.ok().bodyValue(tournamentModerator))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        return request.bodyToMono(TournamentModerator.class)
                .flatMap(useCase::save)
                .flatMap(saved -> ServerResponse.status(HttpStatus.CREATED).bodyValue(saved));
    }

    public Mono<ServerResponse> update(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return request.bodyToMono(TournamentModerator.class)
                .doOnNext(tournamentModerator -> tournamentModerator.setId(id))
                .flatMap(useCase::update)
                .flatMap(updated -> ServerResponse.ok().bodyValue(updated))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.deleteById(id).then(ServerResponse.noContent().build());
    }

}
