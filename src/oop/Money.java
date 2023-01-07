package oop;

import java.math.BigDecimal;

public class Money {

    private String currency;
    private BigDecimal amount;

    public Money(String currency, BigDecimal amount) {
        this. currency = currency;
        this.amount = amount;
    }

    public void print(Printer p){
        p.print(currency);
        p.print(String.valueOf(amount));

    }
}
