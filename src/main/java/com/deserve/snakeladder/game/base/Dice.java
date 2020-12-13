/**
 * 
 */
package com.deserve.snakeladder.game.base;

/**
 * @author narenderk
 *
 */
public class Dice {
  private int numberOnDice;

  public Dice() {
    super();
    this.numberOnDice = -1;
  }

  public int getNumberOnDice() {
    return numberOnDice;
  }

  public void setNumberOnDice(int numberOnDice) {
    this.numberOnDice = numberOnDice;
  }
  
  public void throwDice() {
    double random = Math.random();
    this.numberOnDice = (int) ((random* 6) + 1);
  }
  

}
