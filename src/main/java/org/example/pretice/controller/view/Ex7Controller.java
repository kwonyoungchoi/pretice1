package org.example.pretice.controller.view;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class Ex7Controller {

    @GetMapping("/profile")
    public String showUserProfile() {
        log.info("Get방식으로 profile에 대한 요청 처리하였음.....");

        return "view/ex7Form";
    }

    @PostMapping("/setting")
    public String showUserSetting() {
        log.info("Post방식으로 setting에 대한 요청 처리하였음...");

        return "redirect:/view/profile";
    }

    @GetMapping("/member")
    public ModelAndView showMember() {
        log.info("Get방식으로 member에 대한 요청 처리하였음...");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/ex7Form");

        return modelAndView;
    }

    @PostMapping("/member")
    public ModelAndView showRegister() {
        log.info("Post방식으로 register에 대한 요청 처리하였음...");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/view/profile");

        return  modelAndView;
    }
}
