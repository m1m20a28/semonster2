package semonster2;

public class Monster {

  private String name;
  private int rare = 0;
  private int updn;

  Monster(int nameNum, int rareNum, int rareUpDn) {
    this.name = this.MonsterList(nameNum);
    this.rare = rareNum;
    this.updn = rareUpDn;
  }

  String MonsterList(int number){
    String monsters[] = {"スライム","デュラハン","ドラゴン","ウィッチ","魔王"};
    return monsters[number];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }

  public String updwrareString() {
    return this.name + ":レア度[" + this.rare + "]"+ "のレア度を[" + this.updn + "]に変更";
  }

  public String truerareString() {
    return this.name + ":レア度[" + this.updn + "]";
  }
}
