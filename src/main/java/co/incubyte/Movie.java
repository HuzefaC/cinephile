package co.incubyte;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class Movie {
  private final String name;
  private final String overview;
  private final Float rating;
  private final String posterPath;
  private final LocalDate releaseDate;
  private final Integer voteCount;

  public Movie(
      @JsonProperty("title") String name,
      @JsonProperty("overview") String overview,
      @JsonProperty("vote_average") Float rating,
      @JsonProperty("poster_path") String posterPath,
      @JsonProperty("release_date") LocalDate releaseDate,
      @JsonProperty("vote_count") Integer voteCount) {
    this.name = name;
    this.overview = overview;
    this.rating = rating;
    this.posterPath = posterPath;
    this.releaseDate = releaseDate;
    this.voteCount = voteCount;
  }

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
