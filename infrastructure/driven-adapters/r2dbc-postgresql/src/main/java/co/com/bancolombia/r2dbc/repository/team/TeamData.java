package co.com.bancolombia.r2dbc.repository.team;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("team")
public class TeamData {
    @Id
    private Long id;
    private String name;
    private String description;
    private Long creatorId;
    private String logoUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
