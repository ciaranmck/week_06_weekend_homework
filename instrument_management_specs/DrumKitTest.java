import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class DrumKitTest {

  DrumKit drumkit;

  @Before
  public void before() {
    drumkit = new DrumKit("Pearl");
  }

  @Test
  public void testPlayDrums() {
    assertEquals("Ba Dum Dish", drumkit.playInstrument());
  }

  @Test 
  public void getBrand(){
    assertEquals("Pearl", drumkit.getBrand());
  }

}