public class Finali {

    private static final int CONTO_PER_VINCERE = 2300;
    private final static double EPSILLON = 0.00001; 

    
    public static void nonPuoPagare(){
        Partita.setStatusGioco(true); 
    }

    public static boolean dodicesimoGiorno(){
        if(Partita.getContatoreGiorni() == 12 && (CONTO_PER_VINCERE - StatusDoganiere.getConto()) < EPSILLON ){
            return true;
        }
        return false;
    }
}
