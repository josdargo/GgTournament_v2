package co.com.bancolombia.r2dbc.repository.tournamentteam;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TournamentTeamDataDAO extends ReactiveCrudRepository<TournamentTeamData, Long>, ReactiveQueryByExampleExecutor<TournamentTeamData> {
}
