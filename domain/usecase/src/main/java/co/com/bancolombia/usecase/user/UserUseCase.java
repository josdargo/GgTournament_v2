package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class UserUseCase {
    private final UserRepositoryReactive repository;

    public Mono<User> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<User>> findAll() {
        return repository.findAll();
    }

    public Mono<User> save(User user) {
        return repository.save(user);
    }

    public Mono<User> update(User user) {
        return repository.update(user);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
