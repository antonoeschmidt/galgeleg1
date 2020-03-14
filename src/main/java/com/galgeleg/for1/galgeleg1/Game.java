package com.galgeleg.for1.galgeleg1;

import java.util.ArrayList;

public class Game {
    private String visibleWord;
    private ArrayList<String> usedLetters = new ArrayList<>();
    private int lives;
    private boolean isGameOver;
    private String statusMsg;

    public Game(String visibleWord, int lives, ArrayList<String> usedLetters, boolean isGameOver, String statusMsg) {
        this.visibleWord = visibleWord;
        this.lives = lives;
        this.usedLetters = usedLetters;
        this.isGameOver = isGameOver;
        this.statusMsg = statusMsg;
    }

    public String getVisibleWord() {
        return visibleWord;
    }

    public void setVisibleWord(String visibleWord) {
        this.visibleWord = visibleWord;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public ArrayList<String> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(ArrayList<String> usedLetters) {
        this.usedLetters = usedLetters;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }
}
