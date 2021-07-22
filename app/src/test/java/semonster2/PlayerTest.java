package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void TestPlayer() {
    Player player = new Player("滝廉太郎", 500, 0);
    assertEquals("プレイヤー: 滝廉太郎 HP: 500", player.callPlayer());
    assertEquals("物理攻撃[ダメージ:15]", player.dmgPlayer());
  }
}
