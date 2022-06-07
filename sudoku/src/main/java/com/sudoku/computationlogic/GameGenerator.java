package com.sudoku.computationlogic;

import java.util.Random;

import com.sudoku.problemdomain.SudokuGame.GRID_BOUNDARY;

public class GameGenerator {
  

  public static int[][] getNewGameGrid() {
    return unsolvedGame(getSolvedGame());
  }

  
  /*
   * first we seed a random number gen
   * then we create a new grid based on grid_boundary.
   * for values 1 - 9, we allocate them 9 times.
   * the interrupt back tracks if allocation is attempted too many times, it will increment the 
   * interrupt.
   * while # of times we allocate the number is < 9, keep allocating. if the interrupt is > than 200
   * then we go through the past numbers and reset them to 0.
   * if interrupt is greater than 200, it will reset.
   * the attempts is > 500, then the system is stuck and it will clear everything and completely re-run.
   * the attempts variable works as a fail safe
   */
  private static int[][] getSolvedGame() {
    Random random = new Random(System.currentTimeMillis());
    int[][] newGrid = new int[GRID_BOUNDARY][GRID_BOUNDARY];
    return newGrid;
    
    
  }


  private static int[][] unsolvedGame(int[][] solvedGame) {
    return null;
  }
}
