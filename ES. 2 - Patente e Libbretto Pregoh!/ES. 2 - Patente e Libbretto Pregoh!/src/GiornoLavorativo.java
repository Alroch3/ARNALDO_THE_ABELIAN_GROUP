import it.kibo.fp.lib.RandomDraws;

public class GiornoLavorativo {

    private int giornoCorrente;                                     //da dichiarare come tipo Data 
    
    private static Persona[] personeDelGiorno = new Persona[7];     //N.B. le persone possono variare da 3 a 7 al giorno in modo casuale

    //il metodo drawInteger serve per selezionare un numero intero random tra 3 e 7
    //quando verrà creato un oggetto Giorno lavorativo, verrà gia impostato il numero casuale di persone che passeranno per il confine quel giorno 

    private static int size = RandomDraws.drawInteger(3, 7);        //dimensione dell'array personeDelGiorno perchè questo array potrà non essere completamente riempito dato che le persone possono variare tra 3 e 7 al giorno

    //---------- METODO MAIN SOLO PER DEBUG ----------//
    public static void main(String[] args) {            //solo test

        personeDelGiorno[0] = GestioneXML.creaPersonaDaXML("3");      //Creo un oggetto persona con tutti gli attributi " " perchè se no non posso invocare metodi su Persona perchè è null
                                                                                       //Chiamo il metodo creaPersonaDaXml nella classe Gestione XML passandogli la persona presa dall'array e l'indice della persona da cui leggere e scrivere i dati dall'XML

                                                                                    
        System.out.println(personeDelGiorno[0].toString());
    }

    public int getGiornoCorrente() {
        return giornoCorrente;
    }

    public void setGiornoCorrente(int giornoCorrente) {
        this.giornoCorrente = giornoCorrente;
    }

    public static Persona[] getPersoneDelGiorno() {
        return personeDelGiorno;
    }

    public static void setPersoneDelGiorno(Persona[] personeDelGiorno) {
        GiornoLavorativo.personeDelGiorno = personeDelGiorno;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        GiornoLavorativo.size = size;
    }

    
}
