package instrument_management;

public abstract class Instrument {

  String brand;

  public Instrument(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return this.brand;
  }

}
