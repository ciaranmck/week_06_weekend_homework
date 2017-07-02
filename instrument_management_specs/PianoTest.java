import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Yamaha", 449.99);
  }

  @Test
  public void testPlayPiano() {
    assertEquals("Plink Plonk", piano.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Yamaha", piano.getBrand());
  }

  @Test
  public void getMarkup(){
    assertEquals(67.49, piano.calculateMarkup(15), .01);
  }

  @Test 
  public void getBuyingPrice() {
    assertEquals(449.99, piano.getBuyingPrice(), .01);
  }

  @Test
  public void getSellingPrice() {
    assertEquals(517.48, piano.sellingPrice(15), .01);
  }

}