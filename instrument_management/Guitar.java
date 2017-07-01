package instrument_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  String play;

  public Guitar(String brand) {
    super(brand);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Riff City";
    return this.play;
  }

}