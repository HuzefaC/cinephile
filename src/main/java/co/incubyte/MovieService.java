package co.incubyte;

import io.micronaut.context.annotation.Bean;
import java.util.List;

@Bean
public class MovieService {

  private final MovieGateway movieGateway;

  public MovieService(MovieGateway movieGateway) {
    this.movieGateway = movieGateway;
  }

  public List<Movie> find(String name) {
    return movieGateway.find(name)
        .getResults();
  }

  public Movie findById(int id) {
    return movieGateway.findById(id);
  }
}
