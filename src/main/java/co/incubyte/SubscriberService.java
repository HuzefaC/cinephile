package co.incubyte;

import io.micronaut.context.annotation.Bean;
import java.util.Optional;

@Bean
public class SubscriberService {

  private final SubscriberRepository subscriberRepository;

  public SubscriberService(SubscriberRepository subscriberRepository) {
    this.subscriberRepository = subscriberRepository;
  }

  public Subscriber save(Subscriber subscriber) {
    return subscriberRepository.save(subscriber);
  }

  public Subscriber findById(Long id) {
    Optional<Subscriber> subscriberOptional = subscriberRepository.findById(id);
    return subscriberOptional.orElse(null);
  }
}
