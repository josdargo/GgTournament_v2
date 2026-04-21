package co.com.bancolombia.r2dbc.repository.matchteam;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MatchTeamDataDAO extends ReactiveCrudRepository<MatchTeamData, Long>, ReactiveQueryByExampleExecutor<MatchTeamData> {
}
