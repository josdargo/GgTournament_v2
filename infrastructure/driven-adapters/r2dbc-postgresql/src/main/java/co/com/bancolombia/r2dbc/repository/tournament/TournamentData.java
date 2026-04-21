package co.com.bancolombia.r2dbc.repository.tournament;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("tournament")
public class TournamentData {
    @Id
    private Long id;
    private Long creatorId;
    private String title;
    private String description;
    private Long categoryId;
    private Long gameTypeId;
    private String rulesUrl;
    private String tournamentState;
    private Integer typeConfrontation;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
