package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.general.gateways.CrudRepository;
import co.com.bancolombia.model.user.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
