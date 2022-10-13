package co.incubyte;

import static org.mockito.BDDMockito.then;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubscriberControllerShould {

  @Mock
  SubscriberService service;

  @Test
  @DisplayName("invoke service save")
  void invoke_service_save() {

    SubscriberController subscriberController = new SubscriberController(service);

    Subscriber subscriber = new Subscriber(1L, "email@demo.com", "John", "Doe");
    subscriberController.save(subscriber);

    then(service).should().save(subscriber);
  }

  @Test
  @DisplayName("invoke service find by id")
  void invoke_service_find_by_id() {
    Subscriber subscriber = new Subscriber(1L, "email@demo.com", "John", "Doe");
    SubscriberController subscriberController = new SubscriberController(service);

    subscriberController.findById(1L);

    then(service).should().findById(1L);
  }
}
