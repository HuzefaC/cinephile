package co.incubyte;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.then;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubscriberServiceShould {

  @Mock
  SubscriberRepository subscriberRepository;

  @Test
  @DisplayName("should invoke repository save")
  void should_invoke_repository_save() {

      SubscriberService service = new SubscriberService(subscriberRepository);

      Subscriber subscriber = new Subscriber(1L, "email@demo.com", "John", "Doe");

      service.save(subscriber);

      then(subscriberRepository).should().save(subscriber);
  }

  @Test
  @DisplayName("should find by id")
  void should_find_by_id() {
    SubscriberService service = new SubscriberService(subscriberRepository);

    Subscriber subscriber = new Subscriber(1L, "email@demo.com", "John", "Doe");

    service.findById(1L);

    then(subscriberRepository).should().findById(1L);
  }

}