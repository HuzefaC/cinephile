package co.incubyte;

import java.util.List;

public class TMDBMovie {

  private Integer page;
  private List<Movie> results;

  public Integer getPage() {
    return page;
  }

  public List<Movie> getResults() {
    return results;
  }
}
