/**
 * 
 */
package com.deserve.snakeladder.game.rules;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.deserve.snakeladder.game.base.Board;
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
    Board board = new Board();
    ruleImpl = new RuleImpl(board);
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
  
  @Test
  public void moveFromSnakesHeadToSnakesTailTest() {
    int currentPosition = 8;
    int numberOnDice = 6;
    int nextpostion = ruleImpl.nextPosition(currentPosition, numberOnDice);
    assertEquals(8, nextpostion);
  }
  
  @Test
  public void biteGreenSnakeTest() {
    int currentPosition = 50;
    int numberOnDice = 2;
    int nextpostion = ruleImpl.nextPosition(currentPosition, numberOnDice);
    assertEquals(33, nextpostion);
  }
  
  @Test
  public void biteGreenSnakeOnceTest() {
    int currentPosition = 50;
    int numberOnDice = 2;
    int nextpostion = ruleImpl.nextPosition(currentPosition, numberOnDice);
    
    
    assertEquals(33, nextpostion); 
    
    
    nextpostion = ruleImpl.nextPosition(50, 2);
    assertEquals(52, nextpostion); 
    
    
  }

}
