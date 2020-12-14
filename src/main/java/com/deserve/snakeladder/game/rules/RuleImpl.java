package com.deserve.snakeladder.game.rules;

import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.base.Player;
import com.deserve.snakeladder.game.base.Snake;
import com.deserve.snakeladder.game.base.Tile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author narenderk
 *
 */
public class RuleImpl implements Rule{
  private static final Logger LOGGER = LoggerFactory.getLogger(RuleImpl.class);
  private Board board;

  public RuleImpl(Board board) {
    super();
    this.board = board;
  }

  private boolean isSnakeAtPostion(int position) {
    Tile tile = this.board.getTiles()[position];
    if(null != tile.getSnake()) {
      return true;
    }
    return false;
  }

  private int hissAndGetFinalPosition(int position) {
    Snake snake = this.board.getTiles()[position].getSnake();
    return snake.getFinalPosition();
  }
  
  @Override
  public int nextPosition(int currentPosition, int numberOnDice) {

    int position = currentPosition + numberOnDice;
    if (position == 100) {
      return position;
    }

    if (position < 100) {
      boolean isSnake = isSnakeAtPostion(position);
      if (isSnake) {
        LOGGER.info("found snake at postion: {}", position);
        return hissAndGetFinalPosition(position);
      }
      return position;
    }

    return currentPosition;
  }

  @Override
  public Player nextTurn(Player player, int numberOnDice) {
    // TODO Auto-generated method stub
    return null;
  }

}
