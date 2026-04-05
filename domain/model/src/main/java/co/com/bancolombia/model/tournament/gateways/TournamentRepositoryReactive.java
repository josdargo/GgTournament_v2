package co.com.bancolombia.model.tournament.gateways;

import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;
import co.com.bancolombia.model.tournament.Tournament;

public interface TournamentRepositoryReactive extends ReactiveCrudRepository<Tournament, Long> {
}
