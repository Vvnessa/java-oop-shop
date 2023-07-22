package Org.Lessons.Java.sShop;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

Prodotto orologio= new Prodotto(244222222,"smartwhatch","new",400,22);
System.out.println("il codice del orologio è: " +  orologio.getCodice());
System.out.println("il nome del orologio è: " + orologio.getNome());
System.out.println("la descrizione del tuo prodotto orologio : "+ orologio.getDescrizione());
System.out.println("il prezzo del tuo orologio è di :"  + orologio.getPrezzo());
System.out.println("il tuo orologio prezzo+iva sarebbe di :" + orologio.Calcolaprezzoconiva());


//chiedo all'utente



        System.out.println("Per favore inserire il prodotto che desideri: " );
    String desiderio= scan.nextLine();
    System.out.println("lo desideri nuovo? (Y/N)");
    String scelta=scan.nextLine();


System.out.println("ok di seguito ti daro le informazioni del tuo nuovo orologio");

        System.out.println("nome orologio: " +orologio.getNome());
        System.out.println("descrizione : " + orologio.getDescrizione());
        System.out.println("prezzo base  : "  + orologio.getPrezzo());
        System.out.println(" prezzo con iva : "  + orologio.getIva());
        System.out.println("codice del orologio: " + orologio.getCodice()+ orologio.getNome());






    }
}
