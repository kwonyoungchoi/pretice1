package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ex4")
public class Ex4Controller {

    @GetMapping
    public ModelAndView ex4Form() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex4Form");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView ex4Result() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex4Result");

        return modelAndView;
    }
}
