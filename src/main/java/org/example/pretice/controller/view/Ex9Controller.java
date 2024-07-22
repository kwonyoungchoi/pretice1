package org.example.pretice.controller.view;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class Ex9Controller {

    @GetMapping("/calculate2")
    public String calculate() {
        log.info("계산 입력폼으로 이동");

        return "view/calculate2";
    }

    @PostMapping("/calculate2")
    public ModelAndView calculateSum(@RequestParam(name = "number1", defaultValue = "0") int num1,
                               @RequestParam(name = "number2", defaultValue = "0") int num2,
                               Model model) {
        log.info("Post 요청 처리");

        int sum = num1 + num2;

        ModelAndView mav = new ModelAndView("view/calculateResult2");
        mav.addObject("number1", num1);
        mav.addObject("number2", num2);
        mav.addObject("sum", sum);

        return mav;
    }

    @GetMapping("/calculateResult2")
    public ModelAndView calculateResult(int number1, int number2, Model model) {
        log.info("입력받은 값을 처리하여 결과 페이지로 이동");

        int sum = number1 + number2;

        ModelAndView mav = new ModelAndView();
        mav.addObject("number1", number1);
        mav.addObject("number2", number2);
        mav.addObject("sum", sum);

        mav.setViewName("view/calculateResult2");

        return mav;
    }

}
