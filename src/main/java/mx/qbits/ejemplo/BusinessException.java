package mx.qbits.ejemplo;

public abstract class BusinessException extends Exception {
    private static final long serialVersionUID = -7791799236145925436L;

    private int codigoError;
    private String msgSpanish;
    private boolean severo;
    
    public BusinessException(int codigoError, String msgSpanish, boolean severo) {
        super("Inicializando el valor para el padre");
        this.codigoError = codigoError;
        this.msgSpanish = msgSpanish;
        this.severo = severo;
    }
    
    public int getCodigoError() {
        return this.codigoError;
    }
    public String getMsgString() {
        return this.msgSpanish;
    }
    public boolean isSevero() {
        return this.severo;
    }
}
