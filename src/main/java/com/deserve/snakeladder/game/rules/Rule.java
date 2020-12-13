package com.deserve.snakeladder.game.rules;

import com.deserve.snakeladder.game.base.Player;

/**
 * @author narenderk
 *
 */
public interface Rule {
  int nextPosition(int currentPosition, int numberOnDice);
  //TODO: used when moe than one player playing
  Player nextTurn(Player player, int numberOnDice);
}
