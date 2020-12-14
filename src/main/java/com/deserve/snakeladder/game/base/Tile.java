/**
 * 
 */
package com.deserve.snakeladder.game.base;

/**
 * @author narenderk
 *
 */
public class Tile {

  private int position;
  private Snake snake;

  public Tile(int position) {
    super();
    this.position = position;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public Snake getSnake() {
    return snake;
  }

  public void setSnake(Snake snake) {
    this.snake = snake;
  }

}
