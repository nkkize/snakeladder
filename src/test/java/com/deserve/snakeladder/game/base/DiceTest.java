/**
 * 
 */
package com.deserve.snakeladder.game.base;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.deserve.snakeladder.game.exception.GameNotAllowedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author narenderk
 *
 */
public class DiceTest {
  
  private Dice dice;

  @BeforeEach
  public void initialize() {
    dice = new Dice();
  }
  
  @Test
  public void throwDiceNumber() throws GameNotAllowedException {
    dice.throwDice();
    int number = dice.getNumberOnDice();
    assertTrue(number>0);
    assertTrue(number<=6);
  }
  
  @Test
  public void throwDiceEvenNumber() throws GameNotAllowedException {
    dice.setCrooked(true);
    dice.throwDice();
    int number = dice.getNumberOnDice();
    assertTrue(number%2 == 0);
  }

}
