package co.com.bancolombia.model.match;
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
public class Match {
    private Long id;
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
    private Character groupStageName;
}
