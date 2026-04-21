package co.com.bancolombia.r2dbc.repository.match;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("match")
public class MatchData {
    @Id
    private Long id;
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
    private Character groupStageName;
}
