package com.testSpring2.testSpring2.mvc.controller;

import com.testSpring2.testSpring2.mvc.entity.Board;
import com.testSpring2.testSpring2.mvc.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/test2")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String showList(Model model){

        List<Board> all = boardService.findAll();
        log.info("list<board> : {}",all);
        model.addAttribute("allList",all);
        return "/list";
    }


}
