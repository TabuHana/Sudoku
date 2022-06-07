package com.sudoku.userinterface;

import java.util.HashMap;

import com.sudoku.problemdomain.Coordinates;
import com.sudoku.problemdomain.SudokuGame;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {


  private final Stage stage;
  private final Group root;

  private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;

  private IUserInterfaceContract.EventListener listener;
  
  @Override
  public void handle(KeyEvent keyEvent) {

  }

  @Override
  public void setListener(IUserInterfaceContract.EventListener listener) {

  }

  @Override
  public void updateSquare(int x, int y, int input) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void updateBoard(SudokuGame game) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void showDialog(String message) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void showError(String message) {
    // TODO Auto-generated method stub
    
  }



  
}
