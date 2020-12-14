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
    LOGGER.info("number on dice: {}", numberOnDice);
  }


}
