package co.incubyte;

public class MovieContoller {

  private MovieService movieService;

  public MovieContoller(MovieService movieService) {
    this.movieService = movieService;
  }

  public TMDBMovie find(String name) {
    return movieService.find(name);
  }
}
