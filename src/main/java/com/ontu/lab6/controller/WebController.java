package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class WebController {
    
    public static int SIZE = 3;
    public Random random = new Random();

    public char[][] generateRandomGameBoard() {
        char[][] board = new char[SIZE][SIZE];
        char[] symbols = {'X', 'O', '-'};

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = symbols[random.nextInt(symbols.length)];
            }
        }
        return board;
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        char[][] gameBoard = generateRandomGameBoard();
        model.addAttribute("gameBoard", gameBoard);
        return "index";
    }
}
