import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Fender", 699.49);
  }

  @Test
  public void testPlayGuitar() {
    assertEquals("Riff City", guitar.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Fender", guitar.getBrand());
  }

  @Test
  public void getMarkup(){
    assertEquals(139.89, guitar.calculateMarkup(20), .01);
  }

  @Test 
  public void getBuyingPrice() {
    assertEquals(699.49, guitar.getBuyingPrice(), .01);
  }

  @Test
  public void getSellingPrice() {
    assertEquals(839.38, guitar.sellingPrice(20), .01);
  }

}