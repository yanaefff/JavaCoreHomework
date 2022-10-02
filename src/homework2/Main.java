package homework2;

public class Main {

    static int width = 4;
    static int height = 4;

    static String[][] wrongSizeArray = {{"4", "3", "0", "4"}, {"5", "6", "7", "7"}, {"1", "2", "3"}, {"5", "6", "7"}};
    static String[][] wrongDataArray = {{"4", "3", "1", "4"}, {"5", "6", "7", "8"}, {"1", "2", "A", "9"}, {"5", "6", "7", "8"}};
    static String[][] correctArray = {{"4", "3", "1", "4"}, {"5", "6", "7", "1"}, {"1", "2", "3", "7"}, {"5", "0", "7", "3"}};

    public static void main(String[] args) {

        try {
            System.out.println(sumArray(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println(sumArray(wrongDataArray));
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println(sumArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }


    static void checkSize(String[][] array) throws MyArraySizeException {
        for (int i = 0; i < height; i++) {
            if (array[i].length != width || array.length != height) {
                throw new MyArraySizeException();
            }
        }
    }


    static int sumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkSize(array);
        int result = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[0].length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }

            }
        } catch (NumberFormatException exception) {
            throw new MyArrayDataException("Ошибка преобразования элемента [" + i + "][" + j + "]");
        }
        return result;


    }
}
