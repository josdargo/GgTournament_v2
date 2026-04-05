package co.com.bancolombia.usecase.tournament;

import co.com.bancolombia.model.tournament.Tournament;
import co.com.bancolombia.model.tournament.gateways.TournamentRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TournamentUseCase {
    private final TournamentRepositoryReactive repository;

    public Mono<Tournament> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<Tournament>> findAll() {
        return repository.findAll();
    }

    public Mono<Tournament> save(Tournament tournament) {
        return repository.save(tournament);
    }

    public Mono<Tournament> update(Tournament tournament) {
        return repository.update(tournament);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
