package co.com.bancolombia.r2dbc.repository.announcement;

import co.com.bancolombia.model.announcement.Announcement;
import co.com.bancolombia.model.announcement.gateways.AnnouncementRepositoryReactive;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AnnouncementRepositoryAdapter implements AnnouncementRepositoryReactive {

    private final AnnouncementDataDAO repository;
    private final ObjectMapper mapper;
    @Override
    public Mono<Announcement> findById(Long id) {
        return repository.findById(id)
                .map(this::toEntity);
    }

    @Override
    public Mono<List<Announcement>> findAll() {
        return null;
    }

    @Override
    public Mono<Announcement> save(Announcement entity) {
        return null;
    }

    @Override
    public Mono<Announcement> update(Announcement entity) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Long aLong) {
        return null;
    }

    private Announcement toEntity(AnnouncementData data){
        return mapper.mapBuilder(data, Announcement.AnnouncementBuilder.class).build();
    }
    private AnnouncementData toData(Announcement entity){
        return mapper.map(entity,AnnouncementData.class);
    }
}
