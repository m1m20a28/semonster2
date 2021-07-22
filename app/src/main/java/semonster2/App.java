/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    Monster monster = new Monster(4, 10, 500);
    System.out.println(monster.toString());
    Player player = new Player("タケ", 200);
    System.out.println(player.callPlayer());
    player.attack(159);
    System.out.println(player.callPlayer());
  }
}
