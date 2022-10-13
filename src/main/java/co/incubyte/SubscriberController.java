package co.incubyte;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/subscriber")
public class SubscriberController {

  private final SubscriberService service;

  public SubscriberController(SubscriberService service) {
    this.service = service;
  }

  @Post
  public Subscriber save(Subscriber subscriber) {
    return service.save(subscriber);
  }

  @Get("/{id}")
  public Subscriber findById(Long id) {
    return service.findById(id);
  }
}
