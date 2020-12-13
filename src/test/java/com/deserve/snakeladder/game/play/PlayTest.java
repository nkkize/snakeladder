package com.deserve.snakeladder.game.play;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.exception.GameNotAllowedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author narenderk
 *
 */
public class PlayTest {

  private Play play;

  @BeforeEach
  public void initialize() {
    Board board = new Board();
    play = new Play(board);
  }

  @Test
  public void gameNotAllowedOnceFinishedTest(){
    Assertions.assertThrows(GameNotAllowedException.class, () -> {
      play.setGameOver(true);
      play.playGame();
    });
  }
  
  @Test
  public void gamePlayTest() throws GameNotAllowedException {
    int status = play.playGame();
    assertEquals(0, status);
  }

}
