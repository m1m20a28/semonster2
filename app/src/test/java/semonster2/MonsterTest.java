package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testMonster() {
    Monster monster = new Monster(4,10, 8);
    assertEquals("魔王:レア度[10]のレア度を[8]に変更", monster.updwrareString());
    assertEquals("魔王:レア度[8]", monster.truerareString());
  }
}
