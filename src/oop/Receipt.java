package oop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private final Printer printer;
    private  final List<Item> items = new ArrayList<>();

    Item total ;



    public Receipt(Printer printer) {
        this.printer = printer;
    }

    public  void  add(String description,Money price){
        items.add(new Item(description,price));

    }

//   public void print(){
//        items.forEach(item -> item.print(printer));
//        items.forEach();
//    }



//    public void add(Money price){
//        items.add(new Item(price));
//    }

//    public int add(Money price){
//      return  items.add(new Item(price));
//    }





//    private int add(Item item) {
//        items.add(new Item())
//    }
}
