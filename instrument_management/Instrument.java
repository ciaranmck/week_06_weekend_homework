package instrument_management;

public abstract class Instrument {

  String brand;
  double buyingPrice;
  

  public Instrument(String brand, double buyingPrice) {
    this.brand = brand;
    this.buyingPrice = buyingPrice;
  }

  public String getBrand() {
    return this.brand;
  }

  public double getBuyingPrice() {
    return this.buyingPrice;
  }

   public double calculateMarkup(double markupPercentage) {
    double cost = this.buyingPrice;
    double markup = (cost / 100) * markupPercentage; 
    return markup;
  }

  public double sellingPrice(double markupPercentage) { double cost = this.buyingPrice;
    double markup = (cost / 100) * markupPercentage;
    double sellPrice = markup + this.buyingPrice;
    return sellPrice; 
  }    

}
