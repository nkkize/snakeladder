/**
 * 
 */
package com.deserve.snakeladder.game.base;

/**
 * @author narenderk
 *
 */
public class Board {

  private Tile[][] tiles = new Tile[10][10];
  private Dice dice;
  // REVISIT: extend it to more than one player in future
  private Player player;

  public Board() {
    super();
    createTiles();
    this.dice = new Dice();
    // set the initial position to -1
    this.player = new Player(-1);
  }

  public Tile[][] getTiles() {
    return tiles;
  }

  public void setTiles(Tile[][] tiles) {
    this.tiles = tiles;
  }

  public Dice getDice() {
    return dice;
  }

  public void setDice(Dice dice) {
    this.dice = dice;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  private void createTiles() {
    int currentIndex = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        this.tiles[i][j] = new Tile(j + currentIndex + 1);
      }
      currentIndex = currentIndex + 10;
    }
  }
}
