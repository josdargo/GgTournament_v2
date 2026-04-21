package co.com.bancolombia.r2dbc.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostgresqlConnectionProperties{
    private String host;
    private Integer port;
    private String database;
    private String schema;
    private String username;
    private String password;
}
