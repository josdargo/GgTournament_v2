package co.com.bancolombia.usecase.tournamentteam;

import co.com.bancolombia.model.tournamentteam.TournamentTeam;
import co.com.bancolombia.model.tournamentteam.gateways.TournamentTeamRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TournamentTeamUseCase {
    private final TournamentTeamRepositoryReactive repository;

    public Mono<TournamentTeam> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<TournamentTeam>> findAll() {
        return repository.findAll();
    }

    public Mono<TournamentTeam> save(TournamentTeam tournamentTeam) {
        return repository.save(tournamentTeam);
    }

    public Mono<TournamentTeam> update(TournamentTeam tournamentTeam) {
        return repository.update(tournamentTeam);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
