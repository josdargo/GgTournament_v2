package co.com.bancolombia.r2dbc.repository.teamuser;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TeamUserDataDAO extends ReactiveCrudRepository<TeamUserData, Long>, ReactiveQueryByExampleExecutor<TeamUserData> {
}
