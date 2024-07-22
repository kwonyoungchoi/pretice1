package org.example.pretice.controller.validation;

import lombok.extern.log4j.Log4j2;
import org.example.pretice.dto.validationDTO.ValidationDTO;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class ValidationController {

    @GetMapping("/validation")
    public String validationForm(Model model) {
        log.info("회원정보 입력폼으로 이동...");

        ValidationDTO validationDTO = new ValidationDTO();
        model.addAttribute("validationDTO", validationDTO);

        return "validation/validationForm";
    }

    @PostMapping("/validation")
    public String validationResult(@Validated ValidationDTO validationDTO, BindingResult bindingResult, Model model) {
        log.info("Model방식으로 Post 처리");

        if (bindingResult.hasErrors()) {
            return "validation/validationForm";
        }

        model.addAttribute("validationDTO", validationDTO);

        return "validation/validationResult";

    }

    @PostMapping("/validationmav")
    public ModelAndView memberMav(@Validated ValidationDTO validationDTO, BindingResult bindingResult) {
        log.info("ModelAndView 방식으로 Post 처리");

        ModelAndView mav = new ModelAndView();
        if (bindingResult.hasErrors()) {
            mav.setViewName("validation/validationForm");
        } else {
            mav.addObject("validationDTO", validationDTO);
            mav.setViewName("validation/validationResult");
        }

        return mav;
        }
    
}
