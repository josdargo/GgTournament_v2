package co.com.bancolombia.model.general.gateways;

import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public interface ReactiveCrudRepository<T, ID> {
    Mono<T> findById(ID id);
    Mono<List<T>> findAll();
    Mono<T> save(T entity);
    Mono<T> update(T entity);
    Mono<Void> deleteById(ID id);
}
