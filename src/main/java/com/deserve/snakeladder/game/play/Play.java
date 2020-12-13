package com.deserve.snakeladder.game.play;

import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.exception.GameNotAllowedException;
import com.deserve.snakeladder.game.rules.RuleImpl;

/**
 * @author narenderk
 *
 */
public class Play {
  
  private Board board;
  private RuleImpl ruleImpl;
  private boolean isGameOver;

  public Play(Board board) {
    super();
    this.board = board;
    this.ruleImpl = new RuleImpl();
    this.isGameOver = false;
  }
  
  public boolean isGameOver() {
    return isGameOver;
  }

  public void setGameOver(boolean isGameOver) {
    this.isGameOver = isGameOver;
  }

  /**
   * @return status of the game; 0 = game over
   * @throws GameNotAllowedException
   */
  public int playGame() throws GameNotAllowedException{
    if(this.isGameOver) {
      throw new GameNotAllowedException("game is already over");
    }
    //TODO
    while(!isGameOver) {
     //play
     //TODO: make the game play
     isGameOver = true;
    }
    return 0;
  }
}
