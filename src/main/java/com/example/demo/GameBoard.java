package com.example.demo;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.HashMap;

public class GameBoard {
    private Group group = new Group();
    private Tile[] tiles;
    private Player p1, p2;

    public Tile[] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[] tiles) {
        this.tiles = tiles;
    }

    GameBoard(){

        tiles= new Tile[100];

    }
    public Parent createScene(){


        StackPane root = new StackPane();
        Text temp=  new Text("           Snakes and Ladder Game\n");
        temp.resize(100, 100);
        temp.setFont(Font.font(30));

        group.getChildren().addAll(temp);



//        root.getChildren().add(hbox);

        root.setPrefSize(800, 800);

        for(int i=0;i<10;i++){

            for(int j=0;j<10;j++){

                Tile t =  new Tile();

                t.setWidth(Tile.getLenght());
                t.setHeight(Tile.getGirth());
                t.setFill(Color.DARKSEAGREEN);
                t.setStroke(Color.BEIGE);
                t.setTranslateX(j * Tile.getLenght());
                t.setTranslateY(i * Tile.getGirth());

                if(i%2 != 0){
                    Text text=  new Text("" + ((9-i)*10 +j+1));
                    t.setCord(((9-i)*10 +j+1));
text.setTranslateX(j * Tile.getLenght() + 20);
text.setTranslateY(i * Tile.getLenght() + 20);
text.resize(10, 10);

                    group.getChildren().addAll(t ,text);

                }

                else{
                    t.setCord((9 -i)*10 + (9-j)+1);
                    Text text=  new Text("" + ((9 -i)*10 + (9-j)+1));
                    text.resize(10, 10);
                    text.setTranslateX(j * Tile.getLenght() + 20);
                    text.setTranslateY(i * Tile.getLenght() + 20);

                    group.getChildren().addAll(t, text);
                }




            }

        }

        root.getChildren().addAll(group);


        return root;


    }


    }






