package oop_lesson4.ex_5;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double side,String color,boolean filled){
        super(side, side, color, filled);
    }

}
