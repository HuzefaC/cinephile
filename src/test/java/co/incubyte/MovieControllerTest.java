package co.incubyte;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@MicronautTest
class MovieControllerTest {

  @Inject
  @Client("/movies")
  HttpClient client;

  @Test
  @DisplayName("should return movies on search")
  void should_return_movies_on_search() {

    TMDBMovie movies = client.toBlocking().retrieve(HttpRequest.GET("?query=schindler"), TMDBMovie.class);

    assertThat(movies).isNotNull();
    assertThat(movies.getPage()).isNotNull();
    assertThat(movies.getResults()).isNotNull();

    Movie movie = movies.getResults().get(0);

    assertThat(movie.getName()).contains("Schindler");
    assertThat(movie.getOverview()).isNotNull();
    assertThat(movie.getRating()).isNotNull();
    assertThat(movie.getPosterPath()).isNotNull();
    assertThat(movie.getReleaseDate()).isNotNull();
    assertThat(movie.getVoteCount()).isNotNull();
  }
}
