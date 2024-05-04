import it.kibo.*;

public class GiornoLavorativo {

    //da fare: gestione date con classe date
    private int giornoCorrente;    

    private Persona[] personeDelGiorno = new Persona[7];     
    
    public GiornoLavorativo(int giornoCorrente, Persona [] personeDelGiorno) {
        this.giornoCorrente = giornoCorrente;
        this.personeDelGiorno= personeDelGiorno;
    }
    

    //Metodo che crea un array di persone prese dall'XML e che ritorna l'array stesso
    public Persona[] creaArrayDiPersone(){

        //N.B. le persone possono variare da 3 a 7 al giorno in modo casuale, qua avviene l'estrazione casuale
        int numPersoneCasuale = drawInteger(3, 7);

        for (int i=0; i<numPersoneCasuale; i++){

            //DA GUARDARE COME FUNZIONA LA CREAZIONE DA XML
            this.personeDelGiorno[i]= null;
        }

        return this.personeDelGiorno;
    }
    
    

    //DA SISTEMARE: ho aggiunto il metodo di kibo della classe RANDDRAWS.. qua sotto perchè non riuscivo a farlo funzionare in altri modi
    public static int drawInteger(int minimum, int maximum) {
        int range = maximum + 1 - minimum;
        int casual = (int) (Math.random() * range);
        return casual + minimum;
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
