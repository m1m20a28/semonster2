package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testMonster() {
    Monster monster = new Monster();
    assertEquals("デュラハン:レア度[0]", monster.toString());
  }
}
