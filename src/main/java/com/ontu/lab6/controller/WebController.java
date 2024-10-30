package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    private final char[][] gameBoard;

    public WebController() {
        gameBoard = new char[][] {
            {'X', 'O', '-'},
            {'-', 'X', 'O'},
            {'O', '-', 'X'}
        };
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("gameBoard", gameBoard);
        return "index";
    }
}
