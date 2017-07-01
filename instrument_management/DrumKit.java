package instrument_management;
import behaviours.*;

public class DrumKit extends Instrument implements Playable {

  String play;

  public DrumKit(String brand) {
    super(brand);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Ba Dum Dish";
    return this.play;
  }

}
