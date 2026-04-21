package co.com.bancolombia.r2dbc.repository.announcement;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("announcement")
public class AnnouncementData {
    @Id
    private Long id;
    private String title;
    private String content;
    private Boolean isPinned;
    private Long userId;
    private Long tournamentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
