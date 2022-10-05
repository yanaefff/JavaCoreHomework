package homework3.task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Apple> appleArray = new ArrayList<>(20);

        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        Apple apple3 = new Apple(3);
        Apple apple4 = new Apple(4);
        Apple apple5 = new Apple(5);

       appleArray.add(apple1);
       appleArray.add(apple2);
       appleArray.add(apple3);
       appleArray.add(apple4);

        ArrayList<Orange> orangeArray = new ArrayList<>(15);

        Orange orange1 = new Orange(5);
        Orange orange2 = new Orange(6);
        Orange orange3 = new Orange(7);
        Orange orange4 = new Orange(8);
        Orange orange5 = new Orange(9);

        orangeArray.add(orange1);
        orangeArray.add(orange2);
        orangeArray.add(orange3);
        orangeArray.add(orange4);

        Box appleBox = new Box<>(appleArray);
        Box orangeBox = new Box<>(orangeArray);

        System.out.println(appleBox.getWeightOfBox());
        System.out.println(orangeBox.getWeightOfBox());

        System.out.println(appleBox.compare(orangeBox));

        appleBox.addFruitToBox(apple5);
        appleBox.addFruitToBox(apple5);
        appleBox.addFruitToBox(apple5);
        appleBox.addFruitToBox(apple5);
        appleBox.addFruitToBox(apple5);
        orangeBox.addFruitToBox(orange5);

        System.out.println(appleBox.getWeightOfBox());
        System.out.println(orangeBox.getWeightOfBox());

        System.out.println(appleBox.compare(orangeBox));



        Box newAppleBox = new Box<>(new ArrayList<Apple>(20));

        System.out.println("Вес новой коробки без яблок: " + newAppleBox.getWeightOfBox());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeightOfBox());

        appleBox.moveFruits(newAppleBox);

        System.out.println("Вес новой коробки с яблоками: " + newAppleBox.getWeightOfBox());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeightOfBox());

    }
}
