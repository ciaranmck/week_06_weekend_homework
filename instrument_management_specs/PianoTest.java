import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Yamaha");
  }

  @Test
  public void testPlayPiano() {
    assertEquals("Plink Plonk", piano.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Yamaha", piano.getBrand());
  }

}