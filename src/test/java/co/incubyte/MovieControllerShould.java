package co.incubyte;

import static org.mockito.BDDMockito.then;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MovieControllerShould {

  @Mock
  private MovieService movieService;

  @Test
  @DisplayName("invoke movie service find")
  void invoke_movie_service_find() {
    MovieController movieController = new MovieController(movieService);

    movieController.find("schindler");

    then(movieService).should().find("schindler");
  }

  @Test
  @DisplayName("invoke movie service findById")
  void invoke_movie_service_find_by_id() {
    MovieController controller = new MovieController(movieService);

    controller.findById(10);

    then(movieService).should().findById(10);
  }
}
