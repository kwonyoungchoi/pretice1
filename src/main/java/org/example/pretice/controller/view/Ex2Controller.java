package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex2Controller {

    @GetMapping("/ex2")
    public ModelAndView showGetEx2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex2Form");

        return modelAndView;
    }

    @PostMapping("/ex2")
    public ModelAndView showPostEx2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex2Result");

        return modelAndView;
    }
}

