package com.deserve.snakeladder;

import com.deserve.snakeladder.game.base.Board;
import com.deserve.snakeladder.game.base.Dice;
import com.deserve.snakeladder.game.play.Play;
import org.apache.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

/**
 * @author narenderk
 *
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private static boolean iscrookedDice;

  public static void main(String[] args) {

    org.apache.log4j.Logger logger4j = org.apache.log4j.Logger.getRootLogger();
    logger4j.setLevel(Level.toLevel("INFO"));
    LOGGER.info("Starting snake and ladder game...");
    
    parseCmdLine(args);
    
    Board board = initializeBoard();
    LOGGER.info("board initialized");

    //CLARIFY: make the game run for 10 turns??
    int status = playGame(board);
    if (status == 0) {
      LOGGER.info("game END");
    } else {
      LOGGER.info("please try again...");
    }
  }

  private static void parseCmdLine(String[] args) {
    ArgumentParser parser =
        ArgumentParsers.newArgumentParser("snakeladder").defaultHelp(true).description("snakeladder");
    
    parser.addArgument("-c", "--crooked")
        .help("type of the dice")
        .type(Boolean.class)
        .setDefault(false);
    
    Namespace ns = null;
    try {
        ns = parser.parseArgs(args);
    } catch (ArgumentParserException e) {
        parser.handleError(e);
    }
    iscrookedDice = ns.getBoolean("crooked");
  }

  private static int playGame(Board board) {
    int status = 0;
    try {
      Play play = new Play(board);
      LOGGER.info("starting the game...");
      status = play.playGame();
    } catch (Exception e) {
      LOGGER.error("exception occurred in the game", e);
      status = -1;
    }
    return status;
  }

  private static Board initializeBoard() {
    //create board
    Board board = new Board();
    
    if(iscrookedDice) {
      Dice dice = new Dice();
      dice.setCrooked(iscrookedDice);
      board.setDice(dice);
    }
    
    return board;
  }
}
