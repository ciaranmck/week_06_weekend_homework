import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;
import shop_management.*;


public class ShopTest {

  Shop shop;
  Sellable items;  

  @Before
  public void before() {
    shop = new Shop("Rays Music Exchange");
    // items = new GuitarStrings();
  }

  @Test
  public void testShopName() {
    assertEquals("Rays Music Exchange", shop.getName());
  }

}