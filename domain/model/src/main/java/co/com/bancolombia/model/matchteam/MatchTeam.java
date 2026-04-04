package co.com.bancolombia.model.matchteam;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MatchTeam {
    private Long id;
    private Long matchId;
    private Long teamId;
    private String comment;
}
