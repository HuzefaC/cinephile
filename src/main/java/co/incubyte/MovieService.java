package co.incubyte;

import io.micronaut.context.annotation.Bean;

@Bean
public class MovieService {

  public TMDBMovie find(String name) {
    throw new UnsupportedOperationException();
  }
}
