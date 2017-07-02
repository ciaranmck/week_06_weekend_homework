package instrument_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  String play;
  double buyingPrice;

  public Piano(String brand, double buyingPrice) {
    super(brand, buyingPrice);
    this.play = play;
  }

  public String playInstrument() {
    this.play = "Plink Plonk";
    return this.play;
  }

}