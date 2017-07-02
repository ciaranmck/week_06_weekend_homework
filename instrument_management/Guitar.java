package instrument_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  String play;
  double buyingPrice;

  public Guitar(String brand, double buyingPrice) {
    super(brand, buyingPrice);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Riff City";
    return this.play;
  }

}