import java.time.LocalDate;

import it.kibo.fp.lib.*;

public class Display {

    //---------- REFACTOR ----------//

    private static final String TITOLO_MENU = "Menu principale";
    private static final String TITOLO_MENU_CORRUZIONE = "Signore, ACCETTI LA MIA OFFERTA... in cambio della mia entrata";

    //---------- VOCI MENU ----------//
    private static final String vociMenu [] = {
        "ACCETTARE ENTRATA",
        "RIFIUTARE ENTRATA",
        "REGOLAMENTO",
        "VISUALIZZA GIORNO"
    };
    private static final String vociMenuCorruzione [] = {
        "ACCETTARE OFFERTA",
        "RIFIUTARE L'OFFERTA",
    };

    public static void mostraRegolamento() {             // metodo che aiuta l'utente a capire in cosa consiste il gioco e come vincere

        System.out.println("Benvenuto alla frontiera del Burmini! Per non essere licenziato al primo giorno ci sono delle regole che bisogna seguire..."
                        + "\n 1. Ogni giorno dovrai controllare delle persone e decidere se possono oltrepassare la frontiera"
                        + "\n 2. Se fai passare una persona con passaporto falso/scaduto avrai una possibilià di essere scoperti dal capo e prendere una multa di 300 sbleuri"
                        + "\n 3. Se non fai passare una persona che poteva entrare in modo regolare potrai essere punito e ricevere una multa di 150 sbleuri"
                        + "\n 4. Se svolgi il suo lavoro e rifiuta una persona non in regola essa potrebbe provare a corromperla...Ci PENSI DUE VOLTE AD ACCETTARE!!!"
                        + "\n 5. c'è una buona notizia e una cattiva... ogni persona controllata sono 50 sbleuri ma ogni 3 giorni dovrà pagare 200 sbleuri di tasse...( fossi in lei non evaderei)"
                        + "\n (Detto tra noi... il Burmini sta diventando un paese pericoloso, se vuole sopravvivere dovrà intascare 2300 sblueri in 12 giorni e io mi occuperò della sua fuga)");

    }

    public static void mostraGiorno() {     //serve all'utente per controllare se i documenti sono scaduti

        // metodo che mostra la data odierna 
        System.out.println(" ");
    }


    public static void visualizzaPersona() {

        // per visulaizzare i dati della persona da esaminare a schermo
    }

    public static void mostraContoResiduo() {

        // per visualizzare il conto residuo
    }

    public static void mostraSpese() { // mostra le spese dovute hai giorni precedenti per vari motivi
        // si può anche non fare
    }

    public static void mostraGiorniRimanenti() {

        // mostra quanti giorni restano alla fine
    }

    public static int visualizzaMenu() {// da richiamare su richiesta dell'utente

        Menu menuPrincipale = new Menu(TITOLO_MENU, vociMenu, true, true, true);
        int scelta = menuPrincipale.choose();
        return scelta;

    }

    public static void visualizzaInterfacciaIniziale() {// da richiamare solo la prima volta all'inizio

        System.out.println("“Congratulazioni!\r\n" +
                "La lotteria del lavoro di aprile è terminata. È stato estratto il tuo nome, Ajeje Brazorf. Fai rapporto al Ministero \r\n"
                + //
                "dell'Accoglienza presso il presidio di frontiera Muskalf per il collocamento immediato. Alla tua famiglia verrà \r\n"
                + //
                "assegnato un appartamento di classe 8 a Muskalf Est.\r\n" +
                "BUON LAVORO E GLORIA AL BURMINI!” ");
    }

    public static void visualizzaInizioGioco(int giornoCorrente){
        System.out.print("GIORNO " + giornoCorrente + " DATA: ");
        Display.mostraGiorno();
    }
    /*

    public static void mostraInterfacciaScelta() { // viene richiamata dal metodo fai scelta e mostra il giorno, spese,
                                                   // conto e la persona da accttare o rifiuare

        mostraGiorno();
        System.out.println("\n\n\n");
        mostraSpese();
        mostraContoResiduo();
        System.out.println("\n\n\n");
        visualizzaPersona();

    }
    */
    public static int visualizzaMenuCorruzione() {// da richiamare su richiesta dell'utente
        Menu menuCorruzione = new Menu(TITOLO_MENU_CORRUZIONE, vociMenuCorruzione, true, true, true);
        int scelta = menuCorruzione.choose();
        return scelta;

    }

   


}
