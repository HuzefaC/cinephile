package co.incubyte;

import io.micronaut.context.annotation.Bean;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;

@Bean
public class MovieGateway {

  @Inject
  @Client("https://api.themoviedb.org/3/")
  HttpClient httpClient;

  public TMDBMovie find(String name) {
    String uri = "search/movie?api_key=e470560acfb347655d8af373c29aba11&query=" + name;
    return httpClient.toBlocking().retrieve(HttpRequest.GET(uri), TMDBMovie.class);
  }
}
