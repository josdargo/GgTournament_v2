package co.com.bancolombia.model.match.gateways;

import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;
import co.com.bancolombia.model.match.Match;

public interface MatchRepositoryReactive extends ReactiveCrudRepository<Match, Long> {
}
