package Exceptions;

public class InvalidFigure extends RuntimeException{
    public InvalidFigure(String message) {
        super(message);
    }
}
