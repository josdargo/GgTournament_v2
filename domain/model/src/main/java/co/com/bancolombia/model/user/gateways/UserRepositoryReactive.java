package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;
import co.com.bancolombia.model.user.User;

public interface UserRepositoryReactive extends ReactiveCrudRepository<User, Long> {
}
