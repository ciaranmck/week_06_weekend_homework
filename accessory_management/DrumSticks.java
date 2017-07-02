package accessory_management;
import behaviours.*;

public class DrumSticks implements Sellable  {

  double buyingPrice;
  double sellingPrice;

  public DrumSticks(double buyingPrice, double sellingPrice) {
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  } 

  public double getBuyPrice() {
    return this.buyingPrice;
  }

  public double getSellPrice() {
    return this.sellingPrice;
  }

}

