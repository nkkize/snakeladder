/**
 * 
 */
package com.deserve.snakeladder.game.exception;

/**
 * @author narenderk
 *
 */
public class GameNotAllowedException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public GameNotAllowedException(String message, Throwable cause) {
    super(message, cause);
  }

  public GameNotAllowedException(String message) {
    super(message);
  }
}
