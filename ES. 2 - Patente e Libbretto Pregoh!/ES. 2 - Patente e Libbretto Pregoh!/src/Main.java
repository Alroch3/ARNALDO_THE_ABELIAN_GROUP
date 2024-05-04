import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import it.kibo.fp.lib.InputData;

public class Main {
    public static void main(String[] args) {

        Display.visualizzaInterfacciaIniziale();                                //Iniziamo il programma visualizzando l'interfaccia iniziale

        if(InputData.readYesOrNo("Vuoi visualizzare il regolamento")){
            Display.mostraRegolamento();
        }

        
        
        System.out.println(GestioneXML.cercaComuneDaXML("SANGANO"));

        LocalDate dataPersonalizzata = LocalDate.of(2024, 4, 26);
        dataPersonalizzata.plusDays(5);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println(dataPersonalizzata);

        while(true){                                                            //implementare le condizioni affinchè si ha la fine del gioco
            GiornoLavorativo giorno = new GiornoLavorativo();
            //crea un oggetto GiornoLavorativo
            

        }
    }
}