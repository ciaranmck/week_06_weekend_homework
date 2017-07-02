import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;
import shop_management.*;
import behaviours.*;


public class ShopTest {

  Shop shop;
  Sellable guitarstrings; 
  Sellable drumsticks; 
  Sellable sheetmusic;

  @Before
  public void before() {
    shop = new Shop("Rays Music Exchange");
    guitarstrings = new GuitarStrings();
    drumsticks = new DrumSticks();
    sheetmusic = new SheetMusic();
  }

  @Test
  public void testShopName() {
    assertEquals("Rays Music Exchange", shop.getName());
  }

  @Test
  public void testAddStockCount() {
    shop.addStock(sheetmusic);
    assertEquals(1, shop.stockCount());
  }

  @Test public void testRemoveStockCount() {
    shop.addStock(drumsticks);
    shop.addStock(guitarstrings);
    shop.addStock(sheetmusic);
    shop.removeStock(drumsticks);
    assertEquals(2, shop.stockCount());
  }

}