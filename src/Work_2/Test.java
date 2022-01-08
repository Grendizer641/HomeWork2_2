package Work_2;

public class Test {
    static String[][] someArray = {{String.valueOf(8), String.valueOf(7), String.valueOf(3), String.valueOf(4)},
            {String.valueOf(5), String.valueOf('?'), String.valueOf(7), String.valueOf(7)},
            {String.valueOf(9), String.valueOf(2), String.valueOf(3), String.valueOf(8)},
            {String.valueOf(3), String.valueOf(6), String.valueOf(7), String.valueOf(3)}};

    static int sumOfElements;
    public static void main(String[] args) {
        try {
            checkArraySize4x4();
            sumOfArrayElements();
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArraySize4x4() {
        if (someArray.length != 4) {
            throw new MyArraySizeException();
        }
        for(String[] row : someArray){
            if (row.length != 4){
                throw new MyArraySizeException();
            }
        }
    }

    public static void sumOfArrayElements() {
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                try {
                    int transformed = Integer.parseInt(someArray[i][j]);
                    sumOfElements+=transformed;
                }catch (NumberFormatException e){
                    System.out.println("Координаты элемента [" + i +"][" + j + "]" );
                    throw new MyArrayDataException();
                    //System.out.println(e.getMessage());
                   //
                }

            }
        }
        System.out.println("Сумма преобразованных элементов " + sumOfElements);
    }
}