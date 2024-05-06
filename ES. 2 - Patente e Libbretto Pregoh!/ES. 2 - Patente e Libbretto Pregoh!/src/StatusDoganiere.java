public class StatusDoganiere{

    private static final int TASSE= 200;
    //conto, valore iniziale
    private static double conto=300;

    public static void pagaMulta(double daPagare){
        conto = conto - daPagare;
        disponibilitaSulConto(conto);
    }

    
    public static void pagaMultaPerCorruzione() {
        double multaPerCorruzione= conto*100/60;
        System.out.printf("devi pagare %f $", multaPerCorruzione);
        conto=conto-multaPerCorruzione;
        disponibilitaSulConto(conto);
        System.out.printf("Il tuo saldo attuale: %f", conto);
      }
    
      public static void pagaTasse(){
        conto=conto-TASSE;
        disponibilitaSulConto(conto);
    }

    //DA PROGETTARE GESIONE FINALI!!
    public static void disponibilitaSulConto(double conto){
        if (conto<=0){
            System.out.println("Il tuo saldo è insufficiente, non puoi effettuare il pagamento");
            Finali.nonPuoPagare();
            System.out.println("Sembra che tu abbia appena scambiato la tua divisa da guardia di confine per una tuta arancione!\n"
            + TestoPersonalizzato.testoBluegrosso("\n\t||||||||||||||||||||||||||||| SEI IN STATO DI ARRESTO |||||||||||||||||||||||||||||\n\n\n"));
        }
    }
    public static void aggiornaStipendio(int numPersonePassate){
        conto+=50*numPersonePassate;

    }

    public static double getConto() {
        return conto;
    }
    //metodi: aggiornaConto ..
}
