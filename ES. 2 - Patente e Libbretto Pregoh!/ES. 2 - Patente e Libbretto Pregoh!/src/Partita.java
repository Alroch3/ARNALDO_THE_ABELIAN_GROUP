import java.time.LocalDate;
import java.util.*;

import it.kibo.fp.lib.*;


public class Partita {

    //creo un Array di giorni lavorativi
    private static GiornoLavorativo [] giorniPartita = new GiornoLavorativo[11];
    private static LocalDate dataIniziale = LocalDate.of(2024, 4, 26)

    //metodo da richiamare nel main per far andare il gioco!
    public static void gioco(){
        Display.visualizzaInterfacciaIniziale();
        if(InputData.readYesOrNo("Vuoi visualizzare il regolamento")){
            Display.mostraRegolamento();
        }
        ;

        //do while che segna lo scandire dei giorni
        do{
            int posizioneArray = 0;
            creaGiorno(posizioneArray);
            
            posizioneArray++;  

        }while(Finali.farProseguireIlGioco());
        //sistemare la questione package, non posso fare import java.nomeclasse!!
    }

    public static void creaGiorno(int indice){
        GiornoLavorativo nuovoGiorno = new GiornoLavorativo(dataIniziale.plusDays(indice));
        nuovoGiorno.creaArrayDiPersone();
        giorniPartita[indice] = nuovoGiorno;
    }
}



    

