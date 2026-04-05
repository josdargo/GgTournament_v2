package co.com.bancolombia.usecase.teamuser;

import co.com.bancolombia.model.teamuser.TeamUser;
import co.com.bancolombia.model.teamuser.gateways.TeamUserRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TeamUserUseCase {
    private final TeamUserRepositoryReactive repository;

    public Mono<TeamUser> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<TeamUser>> findAll() {
        return repository.findAll();
    }

    public Mono<TeamUser> save(TeamUser teamUser) {
        return repository.save(teamUser);
    }

    public Mono<TeamUser> update(TeamUser teamUser) {
        return repository.update(teamUser);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
