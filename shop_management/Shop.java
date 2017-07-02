package shop_management;
import behaviours.*;
import java.util.ArrayList;
import java.util.Iterator;

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

  public void addStock(Sellable stock) {
  this.inventory.add(stock);
}

  public void removeStock(Sellable stock) {
  this.inventory.remove(stock);
}

  public int stockCount() {
    return this.inventory.size();
  }



  // public Sellable getStock() {
  //   return this.stock;
  // }

  // public Sellable addStock() {

  // }

  }