package oop_lesson4.ex_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Mammal mammal = new Mammal("Generic Mammal");
        Cat cat = new Cat("Kitty");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");


        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(cat.toString());
        System.out.println(dog1.toString());

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}

