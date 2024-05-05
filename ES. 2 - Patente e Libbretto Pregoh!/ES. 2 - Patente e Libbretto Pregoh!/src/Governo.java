import it.kibo.fp.lib.RandomDraws;

public class Governo extends Partita{
    //aggiungere classe delle costanti con anche le percentuali (da fare con la classe di kibo, numeri casuali da 1 a 100 e verificare se il numero è minore della percentuale che si vuole avere)
    private final static int STIPENDIO_PER_GIORNO = 50;
    private final static int TRECENTO_MULTA= 300;
    private final static int CENTOCINQUANTA_MULTA= 150;

    // (1) L'utente ha ACCETTATO una persona con dati corretti--> si passa a prox persona/giorno

    // (2) L'utente ha ACCETTATO una persona con dati errati--> multa di 300 con 50% di probabilità
    public static void daiMultaTrecento(){
         if((Controllore.controllaPersona(GiornoLavorativo.getUnaPersonaDallArray(contatoreGiorni-1), GiornoLavorativo.getGiornoCorrente()))==false){
            int probabilita = RandomDraws.drawInteger(1, 100);
                if(probabilita<=40){
                    System.out.println("MULTA___300$___: la persona appena entrata deteneva documenti con dati errati");
                    StatusDoganiere.pagaMulta(TRECENTO_MULTA);
            }
        }
    }
    
    // (3) L'utente ha RIFIUTATO una persona con dati corretti
    public static void daiMultaCentoCinquanta(){
        
        if((Controllore.controllaPersona(GiornoLavorativo.getUnaPersonaDallArray(contatoreGiorni-1), GiornoLavorativo.getGiornoCorrente()))==true){
           int probabilita = RandomDraws.drawInteger(1, 100);
            if(probabilita<=50){
                System.out.println("MULTA___150$___: la persona appena rifiutata deteneva documenti con dati corretti");
                StatusDoganiere.pagaMulta(CENTOCINQUANTA_MULTA);
            }
          }
          else Corruzione.provanoACorrompere();
    }

    public static void grandeMultaPerCorruzione() {
        StatusDoganiere.pagaMultaPerCorruzione();
        System.out.println("\nFaccia attenzione a quel che fa... la prossima pena è il carcere");
        }
    
     

    public static void riscuoteTasse(){
        System.out.println("Sono passati due giorni, paga le tasse");
        StatusDoganiere.pagaTasse();
    }

   public static void daiStipendio(int numPersonePassate){
        System.out.printf("Il tuo stipendio giornaliero è di: %d", 50*numPersonePassate);
        StatusDoganiere.aggiornaStipendio(numPersonePassate);
    }
}

    //metodo per gestione stipendio giornaliero

