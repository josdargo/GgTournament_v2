package co.com.bancolombia.model.announcement;
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
public class Announcement {
    private Long id;
    private String title;
    private String content;
    private Boolean isPinned;
    private Long userId;
    private Long tournamentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
