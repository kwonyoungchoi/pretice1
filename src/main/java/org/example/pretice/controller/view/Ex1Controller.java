package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex1Controller {

    @GetMapping("/ex1")
    public String showGetEx1() {
        return "view/ex1Form";
    }

    @PostMapping("/ex1")
    public String showPostEx1() {
        return "view/ex1Result";
    }

}
