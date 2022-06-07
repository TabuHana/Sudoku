package com.sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.sudoku.userinterface.IUserInterfaceContract;

/**
 * JavaFX App
 */
public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        uiImpl = newUserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e)  {
            e.printStackTrace();
            throw e;
        }
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}