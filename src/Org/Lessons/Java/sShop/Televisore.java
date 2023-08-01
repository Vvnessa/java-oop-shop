package Org.Lessons.Java.sShop;

public class Televisore extends Prodotto{
    private  boolean smart;
    private String dimensione;

    public Televisore(int codice, String nome, String marca, double prezzo, double iva, boolean smart, String dimensione) {
        super(codice, nome, marca, prezzo, iva);
        this.smart=smart;
        this.dimensione=dimensione;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }
}
