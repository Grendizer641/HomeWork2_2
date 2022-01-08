package Work_2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Ошибка! На вход должен быть подан массив размера 4х4");
    }
}
