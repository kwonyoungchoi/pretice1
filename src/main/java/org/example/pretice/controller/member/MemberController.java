package org.example.pretice.controller.member;

import lombok.extern.log4j.Log4j2;
import org.example.pretice.dto.member.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
public class MemberController {

    @GetMapping("/memberForm")
    public String memberForm() {
        log.info("회원정보 입력폼으로 이동...");

        return "member/memberForm";
    }

    @PostMapping("/memberProc")
    public String memberResult(MemberDTO memberDTO,
                               RedirectAttributes redirectAttributes) {
        log.info("Model방식으로 Post 처리...");

        redirectAttributes.addFlashAttribute("memberDTO", memberDTO);
        return "redirect:/member/memberResult";
    }

    @PostMapping("/memberProcMav")
    public ModelAndView memberMav(MemberDTO memberDTO,
                                  RedirectAttributes redirectAttributes) {
        log.info("ModelAndView방식으로 Post 처리...");

        redirectAttributes.addFlashAttribute("memberDTO", memberDTO);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/member/memberResult");

        return mav;
    }

    @GetMapping("/member/memberResult")
    public String result(MemberDTO memberDTO, Model model) {

        log.info("Redirect로 결과 처리...");

        return "member/memberResult";
    }
}
