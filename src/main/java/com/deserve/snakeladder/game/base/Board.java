/**
 * 
 */
package com.deserve.snakeladder.game.base;

/**
 * @author narenderk
 *
 */
public class Board {

  private Tile[] tiles = new Tile[100];
  private Dice dice;
  // REVISIT: extend it to more than one player in future
  private Player player;
  private State state;

  public Board() {
    super();
    createTiles();
    createSnakes();
    this.dice = new Dice();
    // set the initial position to -1
    this.player = new Player(-1);
    this.state = State.NOT_STARTED;
  }

  public Tile[] getTiles() {
    return tiles;
  }

  public void setTiles(Tile[] tiles) {
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

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  private void createTiles() {
    for (int i = 0; i < 100; i++) {
      this.tiles[i] = new Tile(i+1);
    }
  }
  

  private void createSnakes() {
    Snake snake = new Snake(14, 8);
    Tile tile = this.tiles[14];
    tile.setSnake(snake);
    
    Snake snake2 = new Snake(32, 10);
    Tile tile2 = this.tiles[32];
    tile2.setSnake(snake2);
    
    //TODO: add more snakes
    //TODO: create ransom number of snakes at random positions
    
  }
}
