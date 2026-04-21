package co.com.bancolombia.r2dbc.repository.matchteam;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("matchTeam")
public class MatchTeamData {
    @Id
    private Long id;
    private Long matchId;
    private Long teamId;
    private String comment;
}
