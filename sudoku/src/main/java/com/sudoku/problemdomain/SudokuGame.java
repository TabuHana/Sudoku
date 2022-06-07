package com.sudoku.problemdomain;

import java.io.Serializable;

import com.sudoku.constants.GameState;

public class SudokuGame implements Serializable{
  private final GameState gameState;
  private final int[][] gridState;

  public static final int GRID_BOUNDARY = 9;

  public SudokuGame(GameState gameState, int[][] gridState) {
    this.gameState = gameState;
    this.gridState = gridState;
  }

  public GameState getGameState() {
    return gameState;
  }

  /*
   * This is immutateble.
   * An immutable class in java means that once an object is 
   * created, we cannot change its content.
   */
  public int[][] getCopyOfGridState() {
    return SudokuUtilities.copyToNewArray(gridState);
  }
}