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
    MovieContoller movieContoller = new MovieContoller(movieService);

    movieContoller.find("schindler");

    then(movieService).should().find("schindler");
  }
}
