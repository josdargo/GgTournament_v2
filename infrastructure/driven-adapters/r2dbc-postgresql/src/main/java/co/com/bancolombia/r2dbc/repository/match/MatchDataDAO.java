package co.com.bancolombia.r2dbc.repository.match;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MatchDataDAO extends ReactiveCrudRepository<MatchData, Long>, ReactiveQueryByExampleExecutor<MatchData> {
}
