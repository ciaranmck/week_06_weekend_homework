import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Fender");
  }

  @Test
  public void testPlayGuitar() {
    assertEquals("Riff City", guitar.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Fender", guitar.getBrand());
  }

}