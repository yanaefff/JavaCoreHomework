package homework3.task1;

import java.util.Arrays;

public class ArrayChange<T> {

    T between;

    public void changePlace(T[] array, int a, int b){
        System.out.println("Before: " + Arrays.toString(array));
       between = array[a];
       array[a] = array[b];
       array[b] = between;
        System.out.println("After: " + Arrays.toString(array));

    }
}
