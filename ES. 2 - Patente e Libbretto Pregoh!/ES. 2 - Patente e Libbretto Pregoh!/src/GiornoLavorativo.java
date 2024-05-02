public class GiornoLavorativo {

    private int giornoCorrente ;                                    //da dichiarare come tipo Data 
    
    private static Persona[] personeDelGiorno = new Persona[7];     //N.B. le persone possono variare da 3 a 7 al giorno in modo casuale
    private static int size;                                        //dimensione dell'array personeDelGiorno perchè questo array potrà non essere completamente riempito dato che le persone possono variare tra 3 e 7 al giorno

    //---------- METODO MAIN SOLO PER DEBUG ----------//
    public static void main(String[] args) {            //solo test

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
    }

    


}
