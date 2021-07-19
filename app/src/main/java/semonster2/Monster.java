package semonster2;

public class Monster {

  private String name;
  private int rare = 0;

  Monster(int nameNum, int rareNum) {
    this.name = this.MonsterList(nameNum);
    this.rare = rareNum;
  }

  String MonsterList(int number){
    String monsters[] = {"スライム","デュラハン","ドラゴン","ウィッチ","魔王"};
    return monsters[number];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
