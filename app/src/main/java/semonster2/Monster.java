package semonster2;

public class Monster {

  private String name;
  private int rare = 0;
  private int hp = 100;

  Monster(int nameNum, int rareNum, int hp) {
    this.name = this.MonsterList(nameNum);
    this.rare = rareNum;
    this.hp = hp;
  }

  String MonsterList(int number) {
    String monsters[] = { "スライム", "デュラハン", "ドラゴン", "ウィッチ", "魔王" };
    return monsters[number];
  }

  public int attack(int damage) {
    this.hp -= damage;
    return this.hp;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
