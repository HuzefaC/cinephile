package co.incubyte;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MovieServiceShould {

  @Mock
  private MovieGateway movieGateway;

  @Test
  @DisplayName("invoke gateway find")
  void invoke_gateway_find() {
    MovieService movieService = new MovieService(movieGateway);

    Movie movie = new Movie("schindler", "", 9.3f, "", LocalDate.now(), 1, 1, "backdropPath",
        "language", 100, "tagline");
    List<Movie> movies = List.of(movie);
    TMDBResponse tmdbResponse = new TMDBResponse();
    tmdbResponse.setPage(1);
    tmdbResponse.setResults(movies);

    given(movieGateway.find("schindler")).willReturn(tmdbResponse);

    movieService.find("schindler");

    then(movieGateway).should().find("schindler");
  }

  @Test
  @DisplayName("invoke gateway find by id")
  void invoke_gateway_find_by_id() {
    MovieService movieService = new MovieService(movieGateway);

    movieService.findById(10);

    then(movieGateway).should().findById(10);
  }


}