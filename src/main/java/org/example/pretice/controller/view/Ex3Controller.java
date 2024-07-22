package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex3")
public class Ex3Controller {

    @GetMapping
    public String ex3Form() {
        return "view/ex3Form";
    }

    @PostMapping
    public String ex3Result() {
        return "view/ex3Result";
    }
}
