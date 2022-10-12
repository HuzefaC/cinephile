package co.incubyte;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class CinephileControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testIndex() {
        String response = client.toBlocking().retrieve("/cinephile/people/tom%20cruise");
        assertThat(response).isEqualTo("Hello tom cruise");
    }
}
