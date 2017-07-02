import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;

public class DrumSticksTest {

  DrumSticks drumsticks;

  @Before
  public void before() {
    drumsticks = new DrumSticks();
  }

  @Test
  public void testBuyPrice() {
    assertEquals(5, drumsticks.getBuyPrice(), .01);
  }

  @Test
  public void testSellPrice() {
    assertEquals(10, drumsticks.getSellPrice(), 01);
  }

}