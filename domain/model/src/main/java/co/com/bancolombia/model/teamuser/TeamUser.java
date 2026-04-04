package co.com.bancolombia.model.teamuser;
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
public class TeamUser {
    private Long id;
    private Long teamId;
    private Long userId;
    private String role;
}
