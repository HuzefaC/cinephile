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
  private final Integer id;
  private final String backdropPath;
  private final String language;
  private final Integer runtime;
  private final String tagline;

  public Movie(@JsonProperty("title") String name, @JsonProperty("overview") String overview,
      @JsonProperty("vote_average") Float rating, @JsonProperty("poster_path") String posterPath,
      @JsonProperty("release_date") LocalDate releaseDate,
      @JsonProperty("vote_count") Integer voteCount, @JsonProperty("id") Integer id,
      @JsonProperty("backdrop_path") String backdropPath,
      @JsonProperty("original_language") String language, @JsonProperty("runtime") Integer runtime,
      @JsonProperty("tagline") String tagline) {
    this.name = name;
    this.overview = overview;
    this.rating = rating;
    this.posterPath = posterPath;
    this.releaseDate = releaseDate;
    this.voteCount = voteCount;
    this.id = id;
    this.backdropPath = backdropPath;
    this.language = language;
    this.runtime = runtime;
    this.tagline = tagline;
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

  public Integer getId() {
    return id;
  }

  public String getBackdropPath() {
    return backdropPath;
  }

  public String getLanguage() {
    return language;
  }

  public Integer getRuntime() {
    return runtime;
  }

  public String getTagline() {
    return tagline;
  }
}
