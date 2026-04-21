package co.com.bancolombia.r2dbc.repository.user;

import co.com.bancolombia.r2dbc.repository.announcement.AnnouncementData;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserDataDAO extends ReactiveCrudRepository<UserData, Long>, ReactiveQueryByExampleExecutor<UserData> {
}
