package com.deserve.snakeladder.game.play;

import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.base.State;
import com.deserve.snakeladder.game.exception.GameNotAllowedException;
import com.deserve.snakeladder.game.rules.RuleImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author narenderk
 *
 */
public class Play {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(Play.class);
  
  private Board board;
  private RuleImpl ruleImpl;
  private boolean isGameOver;
  private int totalSteps;

  public Play(Board board) {
    super();
    this.board = board;
    this.ruleImpl = new RuleImpl(this.board);
    this.isGameOver = false;
  }
  
  public boolean isGameOver() {
    return isGameOver;
  }

  public void setGameOver(boolean isGameOver) {
    this.isGameOver = isGameOver;
  }

  /**
   * @return status of the game; 0 when game over
   * @throws GameNotAllowedException
   */
  public int playGame() throws GameNotAllowedException{
    totalSteps = 0;
    if(isGameOver) {
      throw new GameNotAllowedException("game is already over");
    }
    //do not start until 6 comes
    //boolean gameStarted = false;
    /*while(!gameStarted && board.getDice().getNumberOnDice() != 6) {
      board.getDice().throwDice();
      totalSteps++;
    }
    LOGGER.debug("game started..");
    gameStarted = true;
    //take the player to position 1 once 6 comes on dice
    board.getPlayer().setCurrentPosition(1);
    */
    //without the above rule, take the player to position 0
    board.getPlayer().setCurrentPosition(0);
    board.setState(State.AT_START);
    
    while(!isGameOver) {
      board.getDice().throwDice();
      totalSteps++;
      int nextPosition = ruleImpl.nextPosition(board.getPlayer().getCurrentPosition(), board.getDice().getNumberOnDice());
      board.getPlayer().setCurrentPosition(nextPosition);
      LOGGER.debug("current player is at postion: {}", board.getPlayer().getCurrentPosition());
      
      if(board.getPlayer().getCurrentPosition() == 100) {
        board.setState(State.AT_END);
        isGameOver = true;
        LOGGER.info("game over, totalSteps taken: {}", totalSteps);
        return 0;
      }
      
    }
    return -1;
  }
}
