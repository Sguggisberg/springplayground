package ch.guggisberg.stefan.validation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping()
    public String read() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping()
    public String save(@RequestBody @Valid ModelDto dto) {
        // .....
        return "Greetings from Spring Boot! ";
    }


}
