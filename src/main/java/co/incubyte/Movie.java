package co.incubyte;

import java.time.LocalDate;

public class Movie {
  private String name;
  private String overview;
  private Float rating;
  private String posterPath;
  private LocalDate releaseDate;
  private Integer voteCount;

  public String getName() {
    return name;
  }

  public String getOverview() {
    return overview;
  }

  public Float getRating() {
    return rating;
  }

  public String getPosterPath() {
    return posterPath;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public Integer getVoteCount() {
    return voteCount;
  }
}
