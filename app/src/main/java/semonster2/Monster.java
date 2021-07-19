package semonster2;

public class Monster {

  String name = "デュラハン";
  int rare = 0;

  Monster() {

  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
