package co.incubyte;

public class MovieController {

  private MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  public TMDBMovie find(String name) {
    return movieService.find(name);
  }
}
