package co.incubyte;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller("/cinephile")
public class CinephileController {

    @Inject
    GreeterService greater;

    @Get(uri="/people/{id}", produces="application/json")
    public Response index(String id) {
        return greater.greet(id);
    }
}