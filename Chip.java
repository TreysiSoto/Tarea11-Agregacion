package Movil;

public class Chip {
    private String operador;
    private int numero;

    public Chip(String operador, int numero) {
        this.operador = operador;
        this.numero = numero;
    }

    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
