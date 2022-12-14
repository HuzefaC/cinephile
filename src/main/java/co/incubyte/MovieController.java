package co.incubyte;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import java.util.List;

@Controller("/movies")
public class MovieController {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @Get()
  public List<Movie> find(@QueryValue String query) {
    return movieService.find(query);
  }

  @Get("/{id}")
  public Movie findById(int id) {
    return movieService.findById(id);
  }
}
