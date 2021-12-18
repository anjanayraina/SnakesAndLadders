package com.example.demo;

public class Player {
private static int count=0;
private int pos;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Player(){

    pos=0;


}

public static void increaseCount(){

    Player.count++;

}
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    private boolean turn ;
    private int tile;

    public int getTile() {
        return tile;
    }

    public void setTile(int tile) {
        this.tile = tile;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;

    }



}
