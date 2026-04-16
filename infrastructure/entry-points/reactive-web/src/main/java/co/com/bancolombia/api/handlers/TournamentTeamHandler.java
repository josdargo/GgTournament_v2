package co.com.bancolombia.api.handlers;

import co.com.bancolombia.model.tournamentteam.TournamentTeam;
import co.com.bancolombia.usecase.tournamentteam.TournamentTeamUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TournamentTeamHandler {

    private final TournamentTeamUseCase useCase;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().body(useCase.findAll(), TournamentTeam.class);
    }

    public Mono<ServerResponse> getById(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.findById(id)
                .flatMap(tournamentTeam -> ServerResponse.ok().bodyValue(tournamentTeam))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        return request.bodyToMono(TournamentTeam.class)
                .flatMap(useCase::save)
                .flatMap(saved -> ServerResponse.status(HttpStatus.CREATED).bodyValue(saved));
    }

    public Mono<ServerResponse> update(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return request.bodyToMono(TournamentTeam.class)
                .doOnNext(tournamentTeam -> tournamentTeam.setId(id))
                .flatMap(useCase::update)
                .flatMap(updated -> ServerResponse.ok().bodyValue(updated))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return useCase.deleteById(id).then(ServerResponse.noContent().build());
    }

}
