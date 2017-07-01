import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class DrumKitTest {

  DrumKit drumkit;

  @Before
  public void before() {
    drumkit = new DrumKit();
  }

  @Test
  public void testPlayDrums() {
    assertEquals("Ba Dum Dish", drumkit.playInstrument());
  }

}