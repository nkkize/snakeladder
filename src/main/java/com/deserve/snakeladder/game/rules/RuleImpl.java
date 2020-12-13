package com.deserve.snakeladder.game.rules;

import com.deserve.snakeladder.game.base.Player;

/**
 * @author narenderk
 *
 */
public class RuleImpl implements Rule{

  @Override
  public int nextPosition(int currentPosition, int numberOnDice) {
    int nextPosition = currentPosition;
    if(currentPosition > 0) {
      int position = currentPosition + numberOnDice;
      if(position <= 100) {
        nextPosition = position;
      }
    }
    return nextPosition;
  }

  @Override
  public Player nextTurn(Player player, int numberOnDice) {
    // TODO Auto-generated method stub
    return null;
  }

}
