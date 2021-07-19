package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testMonster() {
    Monster monster = new Monster(4,10);
    assertEquals("魔王:レア度[10]", monster.toString());
  }
}
