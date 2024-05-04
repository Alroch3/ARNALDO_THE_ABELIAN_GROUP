public class StatusDoganiere{

    private static final int TASSE= 200;
    //conto
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
    
    //metodi: aggiornaConto ..
}
