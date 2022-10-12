package co.incubyte;

import static org.mockito.BDDMockito.then;

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

      movieService.find("schindler");

      then(movieGateway).should().find("schindler");
  }

}