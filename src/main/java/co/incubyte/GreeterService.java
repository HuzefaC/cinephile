package co.incubyte;

import io.micronaut.context.annotation.Bean;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;

@Bean
public class GreeterService {
  @Inject
  @Client("https://jsonplaceholder.typicode.com/users/")
  HttpClient httpClient;

  Response greet(String id) {
    Person person = httpClient.toBlocking()
        .retrieve(HttpRequest.GET("/" + id), Person.class);

    String name = person.getName();
    return new Response(name, "Hello");
  }

}
