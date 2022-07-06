package CarmenH.classdesignCh5;

public class SnakeHandler {
  private Snake2 snake;

  public void setSnake(Snake2 snake) {
    this.snake = snake;
  }

  public static void main(String[] args) {
    new SnakeHandler().setSnake(new Cobra());
    new SnakeHandler().setSnake(new Snake2());
    new SnakeHandler().setSnake(null);
  }
}
