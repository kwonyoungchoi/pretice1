package org.example.pretice.controller.Dialect;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class DialectController {

    @GetMapping("/dialect")
    public String dialect() {
        return "dialect/dialectLayout";
    }

}
