package org.example.pretice.controller.board;

import lombok.extern.log4j.Log4j2;
import org.example.pretice.dto.board.CalculateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class CalculateController {
    @GetMapping("/boardCalculate")
    public String boardForm() {
        return "board/calculateForm";
    }

    @PostMapping("/boardCalculate")
    public String calculateResult(CalculateDTO calculateDTO, Model model) {
        String operator = calculateDTO.getOperator();
        int number1 = calculateDTO.getNumber1();
        int number2 = calculateDTO.getNumber2();
        int result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
            case "*":
                result = number1 * number2;
            case "/":
                result = number1 / number2;
        }
        calculateDTO.setResult(result);

        model.addAttribute("data", calculateDTO);

        return "board/calculateResult";
    }

    @PostMapping("/boardCalculatemav")
    public ModelAndView calculateMav(CalculateDTO calculateDTO) {
        String operator = calculateDTO.getOperator();
        int number1 = calculateDTO.getNumber1();
        int number2 = calculateDTO.getNumber2();
        int result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
            case "*":
                result = number1 * number2;
            case "/":
                result = number1 / number2;
        }

        calculateDTO.setResult(result);

        ModelAndView mav = new ModelAndView();
        mav.addObject("data", calculateDTO);
        mav.setViewName("board/calculateResult");

        return mav;
    }
}
