package co.incubyte;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@MicronautTest
class SubscriberControllerTest {

  @Inject
  @Client("/subscriber")
  HttpClient client;

  @Test
  @DisplayName("should save subscriber")
  void should_save_subscriber() {
    Subscriber subscriber = new Subscriber();
    subscriber.setId(1L);
    subscriber.setEmail("jon@winteriscoming.co");
    subscriber.setFirstName("Jon");
    subscriber.setLastName("Snow");

    Subscriber savedSubscriber = client.toBlocking()
        .retrieve(HttpRequest.POST("/", subscriber), Subscriber.class);

    assertThat(savedSubscriber).isNotNull();
    assertThat(savedSubscriber.getId()).isPositive();
    assertThat(savedSubscriber.getEmail()).isEqualTo("jon@winteriscoming.co");
    assertThat(savedSubscriber.getFirstName()).isEqualTo("Jon");
    assertThat(savedSubscriber.getLastName()).isEqualTo("Snow");
  }

  @Test
  @DisplayName("should retrieve subscriber by id")
  void should_retrieve_subscriber_by_id() {
    Subscriber expectedSubscriber = new Subscriber();
    expectedSubscriber.setId(1L);
    expectedSubscriber.setEmail("jon@winteriscoming.co");
    expectedSubscriber.setFirstName("Jon");
    expectedSubscriber.setLastName("Snow");

    Subscriber savedSubscriber = client.toBlocking()
        .retrieve(HttpRequest.POST("/", expectedSubscriber), Subscriber.class);

    Subscriber subscriber = client.toBlocking()
        .retrieve(HttpRequest.GET("/" + savedSubscriber.getId()), Subscriber.class);

    assertThat(subscriber).isNotNull();
    assertThat(subscriber.getId()).isPositive();
    assertThat(subscriber.getEmail()).isEqualTo("jon@winteriscoming.co");
    assertThat(subscriber.getFirstName()).isEqualTo("Jon");
    assertThat(subscriber.getLastName()).isEqualTo("Snow");
  }

}
