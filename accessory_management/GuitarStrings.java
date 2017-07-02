package accessory_management;
import behaviours.*;

public class GuitarStrings implements Sellable  {

  double buyingPrice;
  double sellingPrice;

  public GuitarStrings(double buyingPrice, double sellingPrice) {
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
