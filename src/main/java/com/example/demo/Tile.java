package com.example.demo;

import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    private static final int lenght=50;
    private static final int girth=50;

    public static int getLenght(){

        return lenght;
    }

    public static int getGirth(){

        return girth;
    }



private int cord;

    public int getCord() {
        return cord;
    }

    public void setCord(int cord) {
        this.cord = cord;
    }

    private Snake snake =null;
    private Ladder ladder =null;

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }




}
