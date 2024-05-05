public class StatusDoganiere{

    private static final int TASSE= 200;
    //conto, valore iniziale
    private static double conto=300;

    public static void pagaMulta(double daPagare){
        conto=conto - daPagare;
    }

    public static void pagaTasse(){
        conto=conto-TASSE;
        if(conto<0) //da scegliere se minore o minore e uguale
        {
            
        }
    }

    public static void pagaMultaPerCorruzione() {
        double multaPerCorruzione= conto*100/60;
        System.out.printf("devi pagare %f $", multaPerCorruzione);
        conto=conto-multaPerCorruzione;
        System.out.printf("Il tuo saldo attuale: ", conto);
                
      }
    
    //metodi: aggiornaConto ..
}
