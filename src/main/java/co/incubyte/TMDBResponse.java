package co.incubyte;

import java.util.List;

public class TMDBResponse {

  private Integer page;
  private List<Movie> results;

  public Integer getPage() {
    return page;
  }

  public List<Movie> getResults() {
    return results;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public void setResults(List<Movie> results) {
    this.results = results;
  }
}
