package semonster2;

public class Monster {

  private String name;
  private String waza;
  private int rare = 0;
  private int dmg;
  private int mhp;

  Monster(int nameNum, int rareNum, int wazaNum) {
    this.name = this.MonsterList(nameNum);
    this.mhp = this.MonsterHPList(nameNum);
    this.rare = rareNum;
    this.waza = this.WazaList(wazaNum);
    this.dmg = this.DMGList(wazaNum);
  }

  String MonsterList(int number) {
    String monsters[] = { "スライム", "デュラハン", "ドラゴン", "ウィッチ", "魔王" };
    return monsters[number];
  }

  int MonsterHPList(int hpnumber) {
    int monsterhps[] = { 50, 150, 200, 250, 1000 };
    return monsterhps[hpnumber];
  }

  String WazaList(int wnumber) {
    String attacks[] = { "フレイム", "アイス", "サンダー", "二フラム" };
    return attacks[wnumber];
  }

  int DMGList(int dmgnum) {
    int dmgs[] = { 30, 40, 50, 100 };
    return dmgs[dmgnum];
  }

  public String toString() {
    return this.name + "[HP:" + this.mhp + "]" + ":レア度[" + this.rare + "]";
  }

  public String dmgString() {
    return this.name + "の攻撃[" + this.waza + "]:" + this.dmg + "ダメージ!!";
  }
}
