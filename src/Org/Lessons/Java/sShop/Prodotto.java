package Org.Lessons.Java.sShop;
import java.util.Random;
import java.util.UUID;
public class Prodotto {


    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;


//costruttore


    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;

        this.iva = iva;
        this.codice = generateRandomCode();

    }

    //variabile per il numero random
    private int generateRandomCode() {
        Random randon = new Random();
        //inseriamo qst xk rrstiuisca un valore

        return randon.nextInt(100000) + 1;
    }
    //getter and setter

    public int getCodice() {

        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return marca;
    }

    public void setDescrizione(String descrizione) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

//metodi

    public double Calcolaprezzobase() {

        return prezzo;
    }

    public double Calcolaprezzoconiva() {

        return prezzo + (prezzo * iva / 100);
    }

    public String GetName() {

        String nomecode = String.format("&08d", codice);
        return generateRandomCode() + "-" + nome;
    }
}

