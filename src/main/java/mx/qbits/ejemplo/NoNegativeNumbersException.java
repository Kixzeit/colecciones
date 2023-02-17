package mx.qbits.ejemplo;

public class NoNegativeNumbersException extends BusinessException {
    private static final long serialVersionUID = -6542013855401244661L;

    public NoNegativeNumbersException() {
        super(1273, "No se valen numeros negativos Bobo", false);
    }
}
