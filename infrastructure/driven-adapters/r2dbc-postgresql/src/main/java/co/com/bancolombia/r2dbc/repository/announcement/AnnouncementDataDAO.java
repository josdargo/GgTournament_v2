package co.com.bancolombia.r2dbc.repository.announcement;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementDataDAO extends ReactiveCrudRepository<AnnouncementData, Long>, ReactiveQueryByExampleExecutor<AnnouncementData> {
}
