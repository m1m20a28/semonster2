package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void TestPlayer() {
    Player player = new Player("タケ", 200);
    assertEquals("プレイヤー: タケ HP: 200", player.callPlayer());
  }
}
