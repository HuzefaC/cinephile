package co.incubyte;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.List;
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

    List<Movie> movies = client.toBlocking().retrieve(HttpRequest.GET("?query=schindler"),
        Argument.listOf(Movie.class));

    assertThat(movies).isNotNull();

    Movie movie = movies.get(0);

    assertThat(movie.getId()).isNotNull();
    assertThat(movie.getName()).contains("Schindler");
    assertThat(movie.getOverview()).isNotNull();
    assertThat(movie.getRating()).isNotNull();
    assertThat(movie.getPosterPath()).isNotNull();
    assertThat(movie.getReleaseDate()).isNotNull();
    assertThat(movie.getVoteCount()).isNotNull();
  }

  @Test
  @DisplayName("should return movie detail")
  void should_return_movie_detail() {
    Movie movie = client.toBlocking().retrieve(HttpRequest.GET("/24428"),
        Movie.class);

    assertThat(movie.getId()).isNotNull();
    assertThat(movie.getName()).contains("The Avengers");
    assertThat(movie.getOverview()).isNotNull();
    assertThat(movie.getRating()).isNotNull();
    assertThat(movie.getPosterPath()).isNotNull();
    assertThat(movie.getReleaseDate()).isNotNull();
    assertThat(movie.getVoteCount()).isNotNull();
    assertThat(movie.getBackdropPath()).isNotNull();
    assertThat(movie.getLanguage()).isNotNull();
    assertThat(movie.getRuntime()).isNotNull();
    assertThat(movie.getTagline()).isNotNull();
  }

}
