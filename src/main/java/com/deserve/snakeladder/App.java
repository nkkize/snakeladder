package com.deserve.snakeladder;

import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.play.Play;
import org.apache.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author narenderk
 *
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {

    org.apache.log4j.Logger logger4j = org.apache.log4j.Logger.getRootLogger();
    logger4j.setLevel(Level.toLevel("INFO"));
    LOGGER.info("Starting snake and ladder game...");

    Board board = initializeBoard();
    LOGGER.info("board initialized");

    int status = playGame(board);
    if (status == 0) {
      LOGGER.info("game END");
    } else {
      LOGGER.info("please try again...");
    }
  }

  private static int playGame(Board board) {
    int status = 0;
    try {
      Play play = new Play(board);
      LOGGER.info("starting the game...");
      status = play.playGame();
    } catch (Exception e) {
      // Catch-all exception
      LOGGER.error("exception occurred in the game", e);
      status = -1;
    }
    return status;
  }

  private static Board initializeBoard() {
    //create board
    Board board = new Board();
    return board;
  }
}
