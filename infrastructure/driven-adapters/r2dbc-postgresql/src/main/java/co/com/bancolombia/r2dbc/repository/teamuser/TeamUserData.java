package co.com.bancolombia.r2dbc.repository.teamuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("teamUser")
public class TeamUserData {
    @Id
    private Long id;
    private Long teamId;
    private Long userId;
    private String role;
}
