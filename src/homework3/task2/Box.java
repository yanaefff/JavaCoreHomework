package homework3.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends Fruit, Y extends Fruit>{

    private T tFruit;
    private Y yFruit;

    ArrayList<T> listOfFruits;


    public Box(ArrayList<T> fruitBox){
        this.listOfFruits=fruitBox;
    }

    public ArrayList<T> getListOfFruits(){
        return listOfFruits;
    }

    public int getWeightOfBox(){
        int sum = 0;
        for (T fruit:listOfFruits) {
            sum = sum + fruit.getWeight();
        } return sum;

    }

    public boolean compare(Box <? extends Fruit , ? extends Fruit> someBox){
        if (this.getWeightOfBox() == someBox.getWeightOfBox()){
            return true;
        } return false;
    }

    public void addFruitToBox(T fruit){
        this.getListOfFruits().add(fruit);
    }


    public void moveFruits(Box newBox){
        int i = 0;
        for (i = 0; i < this.getListOfFruits().size(); i++) {
            newBox.getListOfFruits().add(this.getListOfFruits().get(i));
            if (newBox.compare(this)) {
                this.getListOfFruits().clear();
                break;
            }
        }
    }
}
