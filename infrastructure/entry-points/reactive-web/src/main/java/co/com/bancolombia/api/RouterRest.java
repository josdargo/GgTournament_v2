package co.com.bancolombia.api;

import co.com.bancolombia.api.handlers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> apiRoutes(
            AnnouncementHandler announcementHandler,
            TournamentHandler tournamentHandler,
            TeamHandler teamHandler,
            UserHandler userHandler,
            MatchHandler matchHandler,
            TournamentTeamHandler tournamentTeamHandler,
            TeamUserHandler teamUserHandler,
            TournamentModeratorHandler tournamentModeratorHandler,
            MatchTeamHandler matchTeamHandler
    ) {
        return RouterFunctions.nest(path("/api/v1"),

                RouterFunctions
                        // ==========================================
                        // RUTAS PARA ANNOUNCEMENTS
                        // ==========================================
                        .nest(path("/announcements"),
                                RouterFunctions.route(GET(""), announcementHandler::getAll)
                                        .andRoute(GET("/{id}"), announcementHandler::getById)
                                        .andRoute(POST(""), announcementHandler::create)
                                        .andRoute(PUT("/{id}"), announcementHandler::update)
                                        .andRoute(DELETE("/{id}"), announcementHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA TOURNAMENTS
                        // ==========================================
                        .andNest(path("/tournaments"),
                                RouterFunctions.route(GET(""), tournamentHandler::getAll)
                                        .andRoute(GET("/{id}"), tournamentHandler::getById)
                                        .andRoute(POST(""), tournamentHandler::create)
                                        .andRoute(PUT("/{id}"), tournamentHandler::update)
                                        .andRoute(DELETE("/{id}"), tournamentHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA TEAMS
                        // ==========================================
                        .andNest(path("/teams"),
                                RouterFunctions.route(GET(""), teamHandler::getAll)
                                        .andRoute(GET("/{id}"), teamHandler::getById)
                                        .andRoute(POST(""), teamHandler::create)
                                        .andRoute(PUT("/{id}"), teamHandler::update)
                                        .andRoute(DELETE("/{id}"), teamHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA USERS
                        // ==========================================
                        .andNest(path("/users"),
                                RouterFunctions.route(GET(""), userHandler::getAll)
                                        .andRoute(GET("/{id}"), userHandler::getById)
                                        .andRoute(POST(""), userHandler::create)
                                        .andRoute(PUT("/{id}"), userHandler::update)
                                        .andRoute(DELETE("/{id}"), userHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA MATCHES
                        // ==========================================
                        .andNest(path("/matches"),
                                RouterFunctions.route(GET(""), matchHandler::getAll)
                                        .andRoute(GET("/{id}"), matchHandler::getById)
                                        .andRoute(POST(""), matchHandler::create)
                                        .andRoute(PUT("/{id}"), matchHandler::update)
                                        .andRoute(DELETE("/{id}"), matchHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA TOURNAMENT TEAMS
                        // ==========================================
                        .andNest(path("/tournament-teams"),
                                RouterFunctions.route(GET(""), tournamentTeamHandler::getAll)
                                        .andRoute(GET("/{id}"), tournamentTeamHandler::getById)
                                        .andRoute(POST(""), tournamentTeamHandler::create)
                                        .andRoute(PUT("/{id}"), tournamentTeamHandler::update)
                                        .andRoute(DELETE("/{id}"), tournamentTeamHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA TEAM USERS
                        // ==========================================
                        .andNest(path("/team-users"),
                                RouterFunctions.route(GET(""), teamUserHandler::getAll)
                                        .andRoute(GET("/{id}"), teamUserHandler::getById)
                                        .andRoute(POST(""), teamUserHandler::create)
                                        .andRoute(PUT("/{id}"), teamUserHandler::update)
                                        .andRoute(DELETE("/{id}"), teamUserHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA TOURNAMENT MODERATORS
                        // ==========================================
                        .andNest(path("/tournament-moderators"),
                                RouterFunctions.route(GET(""), tournamentModeratorHandler::getAll)
                                        .andRoute(GET("/{id}"), tournamentModeratorHandler::getById)
                                        .andRoute(POST(""), tournamentModeratorHandler::create)
                                        .andRoute(PUT("/{id}"), tournamentModeratorHandler::update)
                                        .andRoute(DELETE("/{id}"), tournamentModeratorHandler::delete)
                        )

                        // ==========================================
                        // RUTAS PARA MATCH TEAMS
                        // ==========================================
                        .andNest(path("/match-teams"),
                                RouterFunctions.route(GET(""), matchTeamHandler::getAll)
                                        .andRoute(GET("/{id}"), matchTeamHandler::getById)
                                        .andRoute(POST(""), matchTeamHandler::create)
                                        .andRoute(PUT("/{id}"), matchTeamHandler::update)
                                        .andRoute(DELETE("/{id}"), matchTeamHandler::delete)
                        )
        );
    }
}
