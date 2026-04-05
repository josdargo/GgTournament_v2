package co.com.bancolombia.usecase.tournamentmoderator;

import co.com.bancolombia.model.tournamentmoderator.TournamentModerator;
import co.com.bancolombia.model.tournamentmoderator.gateways.TournamentModeratorRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TournamentModeratorUseCase {
    private final TournamentModeratorRepositoryReactive repository;

    public Mono<TournamentModerator> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<TournamentModerator>> findAll() {
        return repository.findAll();
    }

    public Mono<TournamentModerator> save(TournamentModerator tournamentModerator) {
        return repository.save(tournamentModerator);
    }

    public Mono<TournamentModerator> update(TournamentModerator tournamentModerator) {
        return repository.update(tournamentModerator);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
