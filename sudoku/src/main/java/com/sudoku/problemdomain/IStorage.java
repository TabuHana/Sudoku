package com.sudoku.problemdomain;

import java.io.IOException;

/*
 * This interface is to design parts of the app up front, ahead of time
 * This is called: Design by Contract
 */
public interface IStorage {
  void updateGameData(SudokuGame game) throws IOException;
  SudokuGame getGameData() throws IOException;
}
