package co.com.bancolombia.r2dbc.repository.team;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TeamDataDAO extends ReactiveCrudRepository<TeamData, Long>, ReactiveQueryByExampleExecutor<TeamData> {
}
