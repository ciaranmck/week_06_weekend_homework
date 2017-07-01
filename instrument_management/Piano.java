package instrument_management;
import behaviours.*;

public class Piano extends Instrument implements Playable {

  String play;

  public Piano(String brand) {
    super(brand);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Plink Plonk";
    return this.play;
  }

}