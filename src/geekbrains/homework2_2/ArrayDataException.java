package geekbrains.homework2_2;

public class ArrayDataException extends RuntimeException {
    public ArrayDataException() {

    }

    public ArrayDataException(String msg) {
        super(msg);
    }

    public ArrayDataException(String msg, Throwable cause){
        super(msg, cause);
    }
}
