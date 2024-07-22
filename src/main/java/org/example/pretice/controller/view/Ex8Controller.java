package org.example.pretice.controller.view;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class Ex8Controller {

    @GetMapping("/calculate")
    public String calculate() {
        log.info("계산 입력폼으로 이동");

        return "view/calculate";
    }

    @PostMapping("/calculate")
    public String calculateSum(@RequestParam(name = "number1", defaultValue = "0") int num1,
                               @RequestParam(name = "number2", defaultValue = "0") int num2,
                               Model model) {
        log.info("Post 요청 처리");

        int sum = num1 + num2;

        model.addAttribute("number1", num1);
        model.addAttribute("number2", num2);
        model.addAttribute("sum", sum);

        return "view/calculateResult";
    }

    @GetMapping("/calculateResult")
    public String calculateResult(int number1, int number2, Model model) {
        log.info("입력받은 값을 처리하여 결과 페이지로 이동");

        int sum = number1 + number2;
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("sum", sum);

        return "view/calculateResult";
    }

}
