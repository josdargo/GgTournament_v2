package co.com.bancolombia.model.teamuser.gateways;

import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;
import co.com.bancolombia.model.teamuser.TeamUser;

public interface TeamUserRepositoryReactive extends ReactiveCrudRepository<TeamUser, Long> {
}
