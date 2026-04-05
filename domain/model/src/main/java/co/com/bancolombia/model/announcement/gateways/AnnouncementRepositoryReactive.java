package co.com.bancolombia.model.announcement.gateways;

import co.com.bancolombia.model.announcement.Announcement;
import co.com.bancolombia.model.general.gateways.ReactiveCrudRepository;

public interface AnnouncementRepositoryReactive extends ReactiveCrudRepository<Announcement,Long> {
}
