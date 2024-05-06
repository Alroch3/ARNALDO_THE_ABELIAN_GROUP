import it.kibo.fp.lib.RandomDraws;

public class Governo extends Partita{
    //aggiungere classe delle costanti con anche le percentuali (da fare con la classe di kibo, numeri casuali da 1 a 100 e verificare se il numero è minore della percentuale che si vuole avere)
    private final static int STIPENDIO_PER_GIORNO = 50;
    private final static int TRECENTO_MULTA= 300;
    private final static int CENTOCINQUANTA_MULTA= 150;


    // (1) L'utente ha ACCETTATO una persona con dati corretti--> si passa a prox persona/giorno


    // (2) L'utente ha ACCETTATO una persona con dati errati--> multa di 300 con 50% di probabilità

    public static void daiMultaTrecento(){

         if((Controllore.controllaPersona(GiornoLavorativo.getUnaPersonaDallArray(getContatoreGiorni()-1), GiornoLavorativo.getGiornoCorrente()))==false){
            
            int probabilita = RandomDraws.drawInteger(1, 100);
             
            if(probabilita<=50){

                int fraseRandom = RandomDraws.drawInteger(1, 5);
                String fraseDefault = " MULTA DI 300$ :";

                switch (fraseRandom) {

                case 1 : 
                        System.out.println(TestoPersonalizzato.testoRossoeGrosso(fraseDefault + "Oops! Sembra che tu abbia appena lasciato entrare un contrabbandiere di ciambelle!\n"));
                break;

                case 2 : 
                        System.out.println(TestoPersonalizzato.testoRossoeGrosso(fraseDefault + "Attenzione! Questo passaporto sembra più falso del mio sorriso il lunedi' mattina\n "));
                break;

                case 3 : 
                        System.out.println(TestoPersonalizzato.testoRossoeGrosso(fraseDefault + "Oh no! Hai appena permesso l’ingresso al famoso ladro Arsenico Lupen\n"));
                break;

                case 4 : 
                        System.out.println(TestoPersonalizzato.testoRossoeGrosso(fraseDefault + "Sembra che tu abbia appena dato il benvenuto al campione mondiale di nascondino.\nNon preoccuparti, nessuno è riuscito a trovarlo per anni!\n"));
                break;

                case 5 : 
                        System.out.println(TestoPersonalizzato.testoRossoeGrosso(fraseDefault + "Hai appena lasciato entrare il sospetto numero uno per il furto di penne a sfera.\n Spero tu non abbia perso la tua!\n"));
                break;
                    
                }

                 StatusDoganiere.pagaMulta(TRECENTO_MULTA);

            }
        }
    }
    


    // (3) L'utente ha RIFIUTATO una persona con dati corretti
    public static void daiMultaCentoCinquanta(){
        
        if((Controllore.controllaPersona(GiornoLavorativo.getUnaPersonaDallArray(getContatoreGiorni()-1), GiornoLavorativo.getGiornoCorrente()))==true){
           int probabilita = RandomDraws.drawInteger(1, 100);
            if(probabilita<=50){
                System.out.println(TestoPersonalizzato.testoRossoeGrosso("MULTA___150$___: la persona appena rifiutata deteneva documenti con dati corretti"));
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
        System.out.printf("Il tuo stipendio giornaliero è di: %d sbleuri", STIPENDIO_PER_GIORNO*numPersonePassate);
        StatusDoganiere.aggiornaStipendio(numPersonePassate);
    }
}

    //metodo per gestione stipendio giornaliero

