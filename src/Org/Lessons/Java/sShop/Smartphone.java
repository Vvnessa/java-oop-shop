package Org.Lessons.Java.sShop;

public class Smartphone  extends Prodotto {
    private  int memoria;
    private String imei;
    public  Smartphone(String nome,String marca, int codice, double prezzo, double iva, int memoria,String imei) {
        super(codice,marca,nome, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;

    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
