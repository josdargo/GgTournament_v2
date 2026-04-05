package co.com.bancolombia.usecase.team;

import co.com.bancolombia.model.team.Team;
import co.com.bancolombia.model.team.gateways.TeamRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TeamUseCase {
    private final TeamRepositoryReactive repository;

    public Mono<Team> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<Team>> findAll() {
        return repository.findAll();
    }

    public Mono<Team> save(Team team) {
        return repository.save(team);
    }

    public Mono<Team> update(Team team) {
        return repository.update(team);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
