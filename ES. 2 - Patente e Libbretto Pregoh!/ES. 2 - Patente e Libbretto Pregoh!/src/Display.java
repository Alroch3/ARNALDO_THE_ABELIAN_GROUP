import java.util.Scanner;

public class Display {

public static void mostraRegolamento(){

    //metodo che aiuta l'utente a capire in cosa consiste il gioco e come vincere
}

public static void mostraGiorno(){

    //metodo che mostra la data odierna 
}

public static void mostraComuni(){

    //per mostrare l'elenco dei comuni validi

}

public static void visualizzaPersona(){

    //per visulaizzare i dati della persona da esaminare a schermo
}

public static void mostraContoResiduo(){

    //per visualizzare il conto residuo
}

public static void mostraSpese(){ // mostra le spese dovute hai giorni precedenti per vari motivi
//si può anche non fare
}

public static void visualizzaInterfaccia(){//da richiamare su richiesta dell'utente

System.out.println("\n opzione 1 : mostra il regolamento");
System.out.println("\n opzione 2 : mostra il Giorno");
System.out.println("\n opzione 3 : mostra i Comuni");
System.out.println("\n opzione 4 : mostra il conto residuo");
System.out.println("\n opzione 5 : mostra i Giorni rimanenti alla fine");
System.out.println("\n opzione 6 : PROSEGUI...");
System.out.println("Scriva il numero dell'opzione che desidera visualizzare:");

   
}

public static void visualizzaInterfacciaIniziale(){// da richiamare solo la prima volta all'inizio

    System.out.println("“Congratulazioni!\r\n" + 
                "La lotteria del lavoro di aprile è terminata. È stato estratto il tuo nome, Ajeje Brazorf. Fai rapporto al Ministero \r\n" + //
                "dell'Accoglienza presso il presidio di frontiera Muskalf per il collocamento immediato. Alla tua famiglia verrà \r\n" + //
                "assegnato un appartamento di classe 8 a Muskalf Est.\r\n" + 
                "BUON LAVORO E GLORIA AL BURMINI!” ");

                visualizzaInterfaccia();

}


public static void mostraInterfacciaGiornaliera(){ //viene visualizzata ogni giorno

    mostraGiorno();
    System.out.println("\n\n\n");
    mostraSpese();
    mostraContoResiduo();
    System.out.println("\n\n\n");
    visualizzaPersona();

}
}
