import java.util.*;

import it.kibo.fp.lib.*;


public class Partita {

    //creo un Array di giorni lavorativi
    private GiornoLavorativo [] giorniPartita= new GiornoLavorativo[11];
    
    public Partita(GiornoLavorativo [] giorniPartita){
        giorniPartita= this.giorniPartita;
    }

    //metodo da richiamare nel main per far andare il gioco!
    
    
    public static void gioco(){
        //do while che segna lo scandire dei giorni
        do{
        int posizioneArray=0;
        GiornoLavorativo nuovoGiorno= new GiornoLavorativo(aggiungiUnGiorno(), creaArrayDiPersone());
        giorniPartita[i]=nuovoGiorno;
        posizioneArray++;   

        }while(Finali.farProseguireIlGioco());
        //sistemare la questione package, non posso fare import java.nomeclasse!!
    }

}

    

