package Work_2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super("Невозможно преобразовать данный элемент в строку");
    }
}
