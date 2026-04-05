package co.com.bancolombia.usecase.matchteam;

import co.com.bancolombia.model.matchteam.MatchTeam;
import co.com.bancolombia.model.matchteam.gateways.MatchTeamRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class MatchTeamUseCase {
    private final MatchTeamRepositoryReactive repository;

    public Mono<MatchTeam> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<MatchTeam>> findAll() {
        return repository.findAll();
    }

    public Mono<MatchTeam> save(MatchTeam matchTeam) {
        return repository.save(matchTeam);
    }

    public Mono<MatchTeam> update(MatchTeam matchTeam) {
        return repository.update(matchTeam);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
