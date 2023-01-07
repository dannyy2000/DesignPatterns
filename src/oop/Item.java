package oop;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String description;
    private List <Money> prices = new ArrayList<>();
//    private Total total;

    public Item(List<Money> prices) {
        this.prices = prices;
    }

    public Item(String description, Money price) {
        this.description = description;


    }



    public void print(Printer p){
        p.print(description);
       p.print(prices.toString());
//        p.print(total.toString());
        p.print(" ");
        p.newLine();


    }

}
