package sheridan.georggeo.midtermpractical.config;

import sheridan.georggeo.midtermpractical.data.jpa.Movie;
import sheridan.georggeo.midtermpractical.data.jpa.Actor;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.stereotype.Component;

@Component
public class RestConfig implements  RepositoryRestConfigurer{
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Movie.class);
        config.exposeIdsFor(Actor.class);
    }
}