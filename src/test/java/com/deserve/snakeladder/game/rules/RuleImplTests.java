/**
 * 
 */
package com.deserve.snakeladder.game.rules;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author narenderk
 *
 */
public class RuleImplTests {
  
  private RuleImpl ruleImpl;
  
  @BeforeEach
  public void initialize() {
    ruleImpl = new RuleImpl();
  }
  
  @Test
  public void moveFromInitialByNumberOnDiceTest() {
    int currentPosition = 1;
    int numberOnDice = 6;
    int nextpostion = ruleImpl.nextPosition(currentPosition, numberOnDice);
    assertEquals(7, nextpostion);
    
  }
  
  @Test
  public void doNotMoveWhenFinalPostionMoreThanHundredTest() {
    int currentPosition = 97;
    int numberOnDice = 6;
    int nextpostion = ruleImpl.nextPosition(currentPosition, numberOnDice);
    assertEquals(97, nextpostion);
  }

}
