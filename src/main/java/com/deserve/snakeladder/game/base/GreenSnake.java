/**
 * 
 */
package com.deserve.snakeladder.game.base;

/**
 * @author narenderk
 *
 */
public class GreenSnake extends Snake {
  
  private boolean hasBitten;

  public GreenSnake(int initialPosition, int finalPosition) {
    super(initialPosition, finalPosition);
    this.hasBitten = false;
  }

  public boolean hasBitten() {
    return hasBitten;
  }

  public void setBiteOnce(boolean biteOnce) {
    this.hasBitten = biteOnce;
  }
}
