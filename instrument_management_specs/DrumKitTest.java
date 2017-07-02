import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class DrumKitTest {

  DrumKit drumkit;

  @Before
  public void before() {
    drumkit = new DrumKit("Pearl", 999.99);
  }

  @Test
  public void testPlayDrums() {
    assertEquals("Ba Dum Dish", drumkit.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Pearl", drumkit.getBrand());
  }

  @Test
  public void getMarkup(){
    assertEquals(249.99, drumkit.calculateMarkup(25), .01);
  }

  @Test 
  public void getBuyingPrice() {
    assertEquals(999.99, drumkit.getBuyingPrice(), .01);
  }

  @Test
  public void getSellingPrice() {
    assertEquals(1249.98, drumkit.sellingPrice(25), .01);
  }

}