import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar();
  }

  @Test
  public void testPlayGuitar() {
    assertEquals("Riff City", guitar.playInstrument());
  }

}