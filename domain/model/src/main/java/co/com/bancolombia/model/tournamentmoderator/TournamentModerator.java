package co.com.bancolombia.model.tournamentmoderator;
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
public class TournamentModerator {
    private Long id;
    private Long tournamentId;
    private Long userId;
}
