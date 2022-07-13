package RalucaG.CodeGym;

import java.awt.*;

public class MinesweeperGame extends Game {
  public static Color getColor(String orange) {
    return Color.orange;
  }

  private static final int SIDE = 9;
  private GameObject[][] gameField = new GameObject[SIDE][SIDE];
  private int countMinesOnField;

  public void setScreenSize() {
    setScreenSize(SIDE, SIDE);
    createGame();
  }

  private void createGame() {
    // tbd code here -- does it use the codegym import, same as for the color method
  }

  private void CreateGame() {
    for (int y = 0; y < SIDE; y++) {
      for (int x = 0; x < SIDE; x++) {
        int randomNumber = getRandomNumber(10);
        boolean isMine = randomNumber < 1;
        if (isMine) {
          countMinesOnField++;
        }
        gameField[y][x] = new GameObject(x, y, isMine);
        setCellColor(x, y, Color.orange);
      }
    }
  }

  private void setCellColor(int x, int y, Color orange) {}

  public static void main(String[] args) {
    System.out.println("Trying my luck on codegym Minesweeper game -- but it's a bit tricky");
  }
}
