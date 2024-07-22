package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ex5")
public class Ex5Controller {

    @GetMapping("/form")
    public String showFrom() {
        return "view/ex5Form";
    }

    @PostMapping("/result")
    public String ResultForm() {
        return "view/ex5Result";
    }
}
