import java.time.LocalDate;
import org.fusesource.jansi.AnsiConsole;
import it.kibo.fp.lib.*;

public class Display {

    //---------- REFACTOR ----------//

    private static final String TITOLO_MENU = "Menu principale";
    private static final String TITOLO_MENU_CORRUZIONE = "Signore, ACCETTI LA MIA OFFERTA... in cambio della mia entrata";

    //---------- VOCI MENU ----------//
    private static final String vociMenu [] = {
        TestoPersonalizzato.testoVerdeegrosso("ACCETTARE ENTRATA"),
        TestoPersonalizzato.testoRossoeGrosso("RIFIUTARE ENTRATA"),
        "REGOLAMENTO",
        "VISUALIZZA GIORNO"
    };
    private static final String vociMenuCorruzione [] = {
        "ACCETTARE OFFERTA",
        "RIFIUTARE L'OFFERTA",
    };

    public static void mostraRegolamento() {             // metodo che aiuta l'utente a capire in cosa consiste il gioco e come vincere

        System.out.println("\t\n  Benvenuto alla frontiera del Burmini! Per non essere licenziato il primo giorno ci sono delle regole da rispettare..."
                        + "\t\n 1. Ogni giorno dovrai controllare delle persone e decidere se possono oltrepassare la frontiera"
                        + "\t\n 2. Se fai passare una persona con passaporto falso/scaduto avrai una possibilià di essere scoperti dal capo e prendere una multa di 300 sbleuri"
                        + "\t\n 3. Se non fai passare una persona che poteva entrare in modo regolare potresti essere punito e ricevere una multa di 150 sbleuri"
                        + "\t\n 4. Se svolgi il tuo lavoro e rifiuti una persona non in regola essa potrebbe provare a corromperti...PENSACI DUE VOLTE AD ACCETTARE!!!"
                        + "\t\n 5. C'è una buona notizia e una cattiva... ogni persona controllata sono 50 sbleuri ma ogni 3 giorni dovrai pagare 200 sbleuri di tasse...( fossi in te non evaderei)"
                        +"\t\n (Detto tra noi... il Burmini sta diventando un paese pericoloso, se vuoi fuggire in tempo mi dovrai portare 2300 in massimo 12 giorni del resto mi occuperò io)\n\n");

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

        AnsiConsole.out().println("\n\n\t\t\t"+TestoPersonalizzato.testoRossoeGrosso("CONGRATULAZIONI!")+"\n");//per avere il testo rosso
        
              System.out.println("\tLa lotteria del lavoro di aprile è terminata. E' stato estratto il tuo nome, Ajeje Brazorf.\n\tFai rapporto al Ministero "
                + //
                "dell'Accoglienza presso il presidio di frontiera Muskalf per il collocamento immediato. \n\tAlla tua famiglia verrà "
                + //
                "assegnato un appartamento di classe 8 a Muskalf Est.\r\n\n" +
                TestoPersonalizzato.testoBluegrosso("\tBUON LAVORO E GLORIA AL BURMINI!\n\n "));
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
