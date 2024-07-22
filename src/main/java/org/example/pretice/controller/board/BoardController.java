package org.example.pretice.controller.board;

import lombok.extern.log4j.Log4j2;
import org.example.pretice.dto.board.BoardDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class BoardController {

    @GetMapping("/board")
    public String boardForm() {
        return "board/boardForm";
    }

    @PostMapping("/board")
    public String boardResult(BoardDTO boardDTO, Model model) {
        model.addAttribute("data", boardDTO);

        return "board/boardResult";
    }

    @PostMapping("/boardmav")
    public ModelAndView boardMav(BoardDTO boardDTO) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("data", boardDTO);
        mav.setViewName("board/boardResult");

        return mav;
    }


}
