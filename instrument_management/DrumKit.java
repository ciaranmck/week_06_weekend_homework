package instrument_management;
import behaviours.*;

public class DrumKit extends Instrument implements Playable  {

  String play;
  double buyingPrice;

  public DrumKit(String brand, double buyingPrice) {
    super(brand, buyingPrice);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Ba Dum Dish";
    return this.play;
  }

}
