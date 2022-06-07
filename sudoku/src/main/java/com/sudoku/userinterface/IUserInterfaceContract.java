package com.sudoku.userinterface;

public interface IUserInterfaceContract {
  interface EventListener {
    void onSudokluInput(int x, int y, int input);
    void onDialogClick();
  }

  interface View {
    void setListener(IUserInterfaceContract.EventListener listener);
    void updateSquare(int x, int y, int input);
    void updateBoard(SudokuGame game);
    void showDialog(String message);
    void showError(String message);
  }
}
