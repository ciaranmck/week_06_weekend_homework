import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;

public class SheetMusicTest {

  SheetMusic sheetmusic;

  @Before
  public void before() {
    sheetmusic = new SheetMusic();
  }

  @Test
  public void testBuyPrice() {
    assertEquals(7, sheetmusic.getBuyPrice(), 01);
  }

  @Test
  public void testSellPrice() {
    assertEquals(13, sheetmusic.getSellPrice(), 01);
  }

}