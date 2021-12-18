package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {



    public void setBackground(){

        Image img =  new Image("ladder-snake-game-funny-frame-children-64850196.jpg");

    }



    @Override
    public void start(Stage stage) throws IOException {



        GameBoard gameBoard = new GameBoard();

        Scene scene = new Scene(gameBoard.createScene(),  1000, 800);
        stage.setTitle("Snakes and Ladders !!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}