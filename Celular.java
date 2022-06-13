package Movil;

public class Celular {
    private String marca;
    private int numImei;
    private String modelo;

    public Celular(String marca, int numImei, String modelo) {
        this.marca = marca;
        this.numImei = numImei;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumImei() {
        return this.numImei;
    }

    public void setNumImei(int numImei) {
        this.numImei = numImei;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
