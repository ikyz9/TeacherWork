package exceptions;

public class FactorialException extends Throwable {
    int n;

    public FactorialException(String s, int num) {
        super(s);
        n = num;

    }
}

