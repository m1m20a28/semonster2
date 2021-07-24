package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testMonster() {
    Monster monster = new Monster(4, 10, 3);
    assertEquals("魔王[HP:1000]:レア度[10]", monster.toString());
    assertEquals("魔王の攻撃[二フラム]:100ダメージ!!", monster.dmgString());
    assertEquals(600, monster.attack(400));
  }
}
