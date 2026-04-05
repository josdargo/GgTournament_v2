package co.com.bancolombia.model.team.gateways;

import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;
import co.com.bancolombia.model.team.Team;

public interface TeamRepositoryReactive extends ReactiveCrudRepository<Team, Long> {
}
