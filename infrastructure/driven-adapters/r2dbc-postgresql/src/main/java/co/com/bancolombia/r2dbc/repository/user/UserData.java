package co.com.bancolombia.r2dbc.repository.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("user")
public class UserData {
    @Id
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String passwordHash;
    private String profilePhotoUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer accessLevel;
}
