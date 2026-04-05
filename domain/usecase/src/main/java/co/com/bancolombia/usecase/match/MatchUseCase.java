package co.com.bancolombia.usecase.match;

import co.com.bancolombia.model.match.Match;
import co.com.bancolombia.model.match.gateways.MatchRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class MatchUseCase {
    private final MatchRepositoryReactive repository;

    public Mono<Match> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<Match>> findAll() {
        return repository.findAll();
    }

    public Mono<Match> save(Match match) {
        return repository.save(match);
    }

    public Mono<Match> update(Match match) {
        return repository.update(match);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
