package co.com.bancolombia.usecase.announcement;

import co.com.bancolombia.model.announcement.Announcement;
import co.com.bancolombia.model.announcement.gateways.AnnouncementRepositoryReactive;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class AnnouncementUseCase {

    private final AnnouncementRepositoryReactive repository;

    public Mono<Announcement> findById(Long id){
        return repository.findById(id);
    }

    public Mono<List<Announcement>> findAll() {
        return repository.findAll();
    }

    public Mono<Announcement> save(Announcement announcement) {
        return repository.save(announcement);
    }

    public Mono<Announcement> update(Announcement announcement) {
        return repository.update(announcement);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}
