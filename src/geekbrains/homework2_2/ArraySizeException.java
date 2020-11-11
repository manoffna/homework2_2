package geekbrains.homework2_2;

public class ArraySizeException extends RuntimeException{
    public ArraySizeException() {

    }

    public ArraySizeException(String msg) {
        super(msg);
    }

    public ArraySizeException(String msg, Throwable cause){
        super(msg, cause);
    }
}
