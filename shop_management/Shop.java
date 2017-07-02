package shop_management;
import behaviours.*;
import java.util.ArrayList;

public class Shop {

  String name;
  ArrayList<Sellable> inventory = new ArrayList<Sellable>();
  Sellable stock;
  

  public Shop(String name) {
    this.name = name;
    this.inventory = inventory;
    this.stock = stock;
  }

  public String getName() {
    return this.name;
  }



  // public Sellable getStock() {
  //   return this.stock;
  // }

  // public Sellable addStock() {

  // }

  }