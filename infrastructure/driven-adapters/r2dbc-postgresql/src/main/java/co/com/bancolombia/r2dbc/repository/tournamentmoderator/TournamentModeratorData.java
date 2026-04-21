package co.com.bancolombia.r2dbc.repository.tournamentmoderator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("tournamentModerator")
public class TournamentModeratorData {
    @Id
    private Long id;
    private Long tournamentId;
    private Long userId;
}
