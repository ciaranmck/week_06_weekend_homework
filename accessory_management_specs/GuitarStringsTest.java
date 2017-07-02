import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;

public class GuitarStringsTest {

  GuitarStrings guitarstrings;

  @Before
  public void before() {
    guitarstrings = new GuitarStrings(7, 12);
  }

  @Test
  public void testBuyPrice() {
    assertEquals(7, guitarstrings.getBuyPrice(), 01);
  }

  @Test
  public void testSellPrice() {
    assertEquals(12, guitarstrings.getSellPrice(), 01);
  }

}