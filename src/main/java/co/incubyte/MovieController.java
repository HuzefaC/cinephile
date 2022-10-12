package co.incubyte;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/movies")
public class MovieController {

  private MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @Get()
  public TMDBMovie find(@QueryValue String query) {
    return movieService.find(query);
  }
}
