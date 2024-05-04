import java.util.ArrayList;

import it.kibo.fp.lib.*;


public class Partita {

    //creo un Array di giorni lavorativi
    private GiornoLavorativo [] giorni= new GiornoLavorativo[11];
    
    public Partita(GiornoLavorativo [] giorni){
        giorni= this.giorni;
    }

    //metodo da richiamare nel main per far andare il gioco!
    public static void gioco(){

        //do while che segna lo scandire dei giorni
        do{
            
        }while(Finali.farProseguireIlGioco());
        //sistemare la questione package, non posso fare import java.nomeclasse!!
    }

    
}
