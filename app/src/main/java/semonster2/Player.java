package semonster2;

public class Player {
  private String name;
  private int hp = 100;

  Player(String n, int h) {
    this.name = n;
    this.hp = h;
  }

  public int attack(int damage) {
    this.hp -= damage;
    return this.hp;
  }

  public String callPlayer() {
    return "プレイヤー: " + this.name + " HP: " + this.hp;
  }
}
