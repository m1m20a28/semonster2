package semonster2;

public class Player {
  private String name;
  private int hp = 100;
  private String waza;
  private int dmg;

  Player(String n, int h, int wn) {
    this.name = n;
    this.hp = h;
    this.waza = WazaList(wn);
    this.dmg = DMGList(wn);
  }

  public int attack(int damage) {
    this.hp -= damage;
    return this.hp;
  }

  public String callPlayer() {
    return "プレイヤー: " + this.name + " HP: " + this.hp;
  }

  public String dmgPlayer() {
    return this.waza + "[ダメージ:" + this.dmg + "]";
  }

  String WazaList(int wnum) {
    String WAZA[] = { "物理攻撃", "魔法攻撃", "必殺技" };
    return WAZA[wnum];
  }

  int DMGList(int dnum) {
    int dmgs[] = { 15, 20, 50 };
    return dmgs[dnum];
  }
}
