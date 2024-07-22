package org.example.pretice.controller.view;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
public class Ex11Controller {

    @GetMapping("/calculate4")
    public String calculate() {
        log.info("리다이렉트 활용 계산 입력폼으로 이동");

        return "view/calculate4";
    }

    @PostMapping("/calculate4")
    public ModelAndView calculateSum(
            @RequestParam(name = "number1", defaultValue = "0") int num1,
            @RequestParam(name = "number2", defaultValue = "0") int num2,
            RedirectAttributes redirectAttributes) {
        log.info("리다이렉트를 활용한 Post 요청 처리");

        int sum = num1 + num2;

        ModelAndView mav = new ModelAndView("redirect:/calculateResult4");

        redirectAttributes.addAttribute("number1", num1);
        redirectAttributes.addAttribute("number2", num2);
        redirectAttributes.addAttribute("sum", sum);

        return mav; //calculateResult 매핑으로 이동한다.
    }

    @GetMapping("/calculateResult4")
    public ModelAndView calculateResult(int number1, int number2, Model model){
        log.info("입력받은 값을 처리하여 결과 페이지로 이동");

        int sum = number1 + number2;

        ModelAndView mav = new ModelAndView();

        mav.addObject("number1", number1);
        mav.addObject("number2", number2);
        mav.addObject("sum", sum);

        mav.setViewName("calculateResult4");


        return mav;

    }


}
