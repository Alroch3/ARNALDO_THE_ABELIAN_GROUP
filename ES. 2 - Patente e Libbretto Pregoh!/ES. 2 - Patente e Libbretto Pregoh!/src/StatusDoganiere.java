public class StatusDoganiere{

    private static final int TASSE= 200;
    //conto, valore iniziale
    private static double conto=300;

    public static void pagaMulta(double daPagare){
        disponibilitaSulConto(conto);
        conto = conto - daPagare;
    
    }

    
    public static void pagaMultaPerCorruzione() {
        disponibilitaSulConto(conto);
        double multaPerCorruzione= conto*100/60;
        System.out.printf("devi pagare %f $", multaPerCorruzione);
        conto=conto-multaPerCorruzione;
        System.out.printf("Il tuo saldo attuale: %f", conto);
        
                
      }
    
      public static void pagaTasse(){
        disponibilitaSulConto(conto);
        conto=conto-TASSE;
                
    }

    //DA PROGETTARE GESIONE FINALI!!
    public static void disponibilitaSulConto(double conto){
        if (conto<=0){
            System.out.println("Il tuo saldo è 0$, non puoi effettuare il pagamento");
           // Finali.IlgiocoDeveFinire(-1);
            System.out.println("Sei in stato di arresto");
        }
    }
    public static void aggiornaStipendio(int numPersonePassate){
        conto+=50*numPersonePassate;

    }
    //metodi: aggiornaConto ..
}
