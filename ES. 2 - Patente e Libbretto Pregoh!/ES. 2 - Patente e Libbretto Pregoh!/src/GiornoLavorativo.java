import java.time.LocalDate;

import it.kibo.fp.lib.RandomDraws;

public class GiornoLavorativo {

    private static LocalDate giornoCorrente;   
    
    private int numPersonePassate;

    private static Persona[] personeDelGiorno = new Persona[7];   
    
    public GiornoLavorativo(LocalDate giornoCorrente) {
        this.giornoCorrente = giornoCorrente;
    }
    
    //Metodo che crea un array di persone prese dall'XML e che ritorna l'array stesso
    public void creaArrayDiPersone(){

        //N.B. le persone possono variare da 3 a 7 al giorno in modo casuale, qua avviene l'estrazione casuale
        numPersonePassate = RandomDraws.drawInteger(3, 7);

        for (int i=0; i<numPersonePassate; i++){
            personeDelGiorno[i]= GestioneXML.creaPersonaDaXML(RandomDraws.drawInteger(0, 1000));
        }

    }

    public static LocalDate getGiornoCorrente() {
        return giornoCorrente;
    }
    /*
     * @author Gaia:
     * 
     * CAMBIAMENTI: -> AGGIUNTA NUOVO METODO
     * 
     * SPIEGAZIONE: nuovo metodo che ritorna un oggetto Persona in posizione "indice" dall'array di persone creato precedentemente
     *              
     */

    public static Persona getUnaPersonaDallArray(int indice) {
        return personeDelGiorno[indice];
    }

    public static Persona [] getPersone() {
        return personeDelGiorno;
    }

    public String toString(int indice) {
        return personeDelGiorno[indice].toString();
    }

    

    public int getNumPersonePassate() {
        return numPersonePassate;
    }

    //---------- METODO MAIN SOLO PER DEBUG ----------//
    /*public static void main(String[] args) {            //solo test

        personeDelGiorno[0] = new Persona("", "", "", "", "", "", "");      //Creo un oggetto persona con tutti gli attributi " " perchè se no non posso invocare metodi su Persona perchè è null
        GestioneXML.creaPersonaDaXML(personeDelGiorno[0], "1");                                        //Chiamo il metodo creaPersonaDaXml nella classe Gestione XML passandogli la persona presa dall'array e l'indice della persona da cui leggere e scrivere i dati dall'XML

        //stampa per debug della persona 0 dell'array personeDeglGiorno 
        System.out.println("nome: " + personeDelGiorno[0].getNome() + "\n" 
                         + "cognome: " + personeDelGiorno[0].getCognome() + "\n"
                         + "sesso: " + personeDelGiorno[0].getSesso() + "\n"
                         + "data di nascita: " + personeDelGiorno[0].getData() + "\n"
                         + "comune: " + personeDelGiorno[0].getLuogoDiNascita() + "\n"
                         + "cf: " + personeDelGiorno[0].getcF() + "\n"
                         + "scadenza: " + personeDelGiorno[0].getScadenza());
    }*/
}
