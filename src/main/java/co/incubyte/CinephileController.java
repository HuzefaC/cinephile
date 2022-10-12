package co.incubyte;

import io.micronaut.http.annotation.*;

@Controller("/cinephile")
public class CinephileController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}