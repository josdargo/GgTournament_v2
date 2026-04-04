package co.com.bancolombia.model.tournament;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Tournament {
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
