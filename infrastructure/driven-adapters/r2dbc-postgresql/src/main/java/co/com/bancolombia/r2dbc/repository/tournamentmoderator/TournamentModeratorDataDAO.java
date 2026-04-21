package co.com.bancolombia.r2dbc.repository.tournamentmoderator;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TournamentModeratorDataDAO extends ReactiveCrudRepository<TournamentModeratorData, Long>, ReactiveQueryByExampleExecutor<TournamentModeratorData> {
}
