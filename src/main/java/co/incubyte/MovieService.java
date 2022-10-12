package co.incubyte;

import io.micronaut.context.annotation.Bean;

@Bean
public class MovieService {

  private final MovieGateway movieGateway;

  public MovieService(MovieGateway movieGateway) {
    this.movieGateway = movieGateway;
  }

  public TMDBMovie find(String name) {
    return movieGateway.find(name);
  }
}
