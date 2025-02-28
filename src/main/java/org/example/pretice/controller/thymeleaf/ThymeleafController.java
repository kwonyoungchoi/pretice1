package org.example.pretice.controller.thymeleaf;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class ThymeleafController {

    @GetMapping("/thymeleaf")
    public String thymeleaf() {
        return "thymeleaf/thymeleafLayout";

    }

}
