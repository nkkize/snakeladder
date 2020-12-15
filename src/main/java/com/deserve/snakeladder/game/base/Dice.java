/**
 * 
 */
package com.deserve.snakeladder.game.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author narenderk
 *
 */
public class Dice {
  private static final Logger LOGGER = LoggerFactory.getLogger(Dice.class);

  
  private int numberOnDice;
  private boolean isCrooked;

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
  
  public boolean isCrooked() {
    return isCrooked;
  }

  public void setCrooked(boolean isCrooked) {
    this.isCrooked = isCrooked;
  }

  public void throwDice() {
    double random = Math.random();
    int diceNumber = (int) ((random* 6) + 1);
    if(isCrooked && diceNumber%2 !=0) {
      //set even numbers
      diceNumber++;
    }
    this.numberOnDice = diceNumber;
    LOGGER.info("number on dice: {}", numberOnDice);
  }


}
