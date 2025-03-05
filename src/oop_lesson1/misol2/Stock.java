package oop_lesson1.misol2;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock (String symbol,String name,double previousClosingPrice,double currentPrice){
        this.symbol=symbol;
        this.name=name;
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;
    }
    double getChangePercent(){
        return (currentPrice/previousClosingPrice-1)*100;
    }
}
