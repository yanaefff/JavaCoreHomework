package homework3.task1;

public class Main {

    static String[] array = {"A", "B", "C", "D", "E"};
    static Integer[] array2 = {11, 22, 33, 44, 55};


    public static void main(String[] args) {
        ArrayChange<Object> arrayChange = new ArrayChange<>();
        try{
            arrayChange.changePlace(array, 1, 2);
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("Неверный индекс массива");
        }

        try{
        arrayChange.changePlace(array2, 3, 4);
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("Неверный индекс массива");
        }

        try{
            arrayChange.changePlace(array2, 3, 10);
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("Неверный индекс массива");
        }
    }

}
