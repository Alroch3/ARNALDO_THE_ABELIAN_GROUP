public class Finali {

    private static final int GIORNI_PER_FUGGIRE = 12;
    private static final int CONTO_PER_VINCERE = 2300;
    private final static double EPSILLON = 0.00001; 

    
    public static void nonPuoPagare(){
        giocoFinito();
    }

    public static void giocoFinito(){
        Partita.setStatusGioco(true); 
    }

    public static void dodicesimoGiorno(){
        if(Partita.getContatoreGiorni() == GIORNI_PER_FUGGIRE){
            if((CONTO_PER_VINCERE - StatusDoganiere.getConto()) < EPSILLON ){
                giocoFinito();
                Display.haiVinto();
            }else{
                giocoFinito();
                Display.haiPerso();
            }
        }
        
    }
}
