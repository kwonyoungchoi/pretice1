package org.example.pretice.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ex6")
public class Ex6Controller {

    @GetMapping("/form")
    public ModelAndView showForm() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex6Form");
        return modelAndView;
    }

    @PostMapping("/result")
    public ModelAndView showResult() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex6Result");

        return modelAndView;
    }
}
