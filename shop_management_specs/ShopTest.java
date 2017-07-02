import static org.junit.Assert.*;
import org.junit.*;
import accessory_management.*;
import shop_management.*;


public class ShopTest {

  Shop shop;
  // Sellable stock;

  @Before
  public void before() {
    shop = new Shop("Rays Music Exchange");
    // stock = new GuitarStrings();
  }

  @Test
  public void testShopName() {
    assertEquals("Rays Music Exchange", shop.getName());
  }

}