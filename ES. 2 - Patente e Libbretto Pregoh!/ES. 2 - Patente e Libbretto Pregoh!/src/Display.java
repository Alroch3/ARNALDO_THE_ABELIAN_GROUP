import org.fusesource.jansi.AnsiConsole;
import it.kibo.fp.lib.*;

public class Display {

    //---------- REFACTOR ----------//

    private static final String TITOLO_MENU = "Menu principale";
    private static final String TITOLO_MENU_CORRUZIONE = TestoPersonalizzato.testoBluegrosso("PROPOSTA DA TIZIO LOSCO");

    //---------- VOCI MENU ----------//
    private static final String vociMenu [] = {
        TestoPersonalizzato.testoVerdeegrosso("ACCETTARE ENTRATA"),
        TestoPersonalizzato.testoRossoeGrosso("RIFIUTARE ENTRATA"),
        "REGOLAMENTO",
        "VISUALIZZA GIORNO"
    };
    private static final String vociMenuCorruzione [] = {
        TestoPersonalizzato.testoVerdeegrosso("ACCETTARE L'OFFERTA"),
        TestoPersonalizzato.testoRossoeGrosso("RIFIUTARE L'OFFERTA"),
    };

    public static void mostraRegolamento() {             // metodo che aiuta l'utente a capire in cosa consiste il gioco e come vincere

        System.out.println("\nBenvenuto alla frontiera del Burmini!\nPer non essere licenziato il primo giorno ci sono delle regole da rispettare..."
                        + "\t\n\n1. Ogni giorno dovrai controllare delle persone e decidere se possono oltrepassare la frontiera"
                        + "\t\n\n2. Se ACCETTI con passaporto falso/scaduto avrai una possibilià di essere scoperto dal capo\n   e potresti una multa di 300 sbleuri"
                        + "\t\n\n3. Se RIFIUTI una persona che poteva entrare in modo regolare\n   potresti essere punito e ricevere una multa di 150 sbleuri"
                        + "\t\n\n4. Se svolgi il tuo lavoro e rifiuti una persona non in regola essa potrebbe provare a corromperti...\n   PENSACI DUE VOLTE AD ACCETTARE!!!"
                        + "\t\n\n5. C'è una buona notizia e una cattiva...\n   ogni persona controllata sono 50 sbleuri.\n   Ogni 3 giorni dovrai pagare 200 sbleuri di tasse...( fossi in te non evaderei)"
                        +"\t\n\n  (Detto tra noi... il Burmini sta diventando un paese pericoloso,\n  se vuoi fuggire in tempo mi dovrai portare 2300 in massimo 12 giorni del resto mi occuperò io)\n\n"
                        + "\t\n  COMPOSIZIONE CODICE FISCALE :\n  3 LETTERE --> COGNOME\n  3 LETTERE --> NOME"
                        +"\n  2 CIFRE --> ANNO DI NASCITA\n  1 LETTERA --> MESE DI NASCITA\n  2 CIFRE --> GIORNO DI NASCITA "
                        + "\n  1 LETTERA + 3 CIFRE --> LUOGO DI NASCITA\n  1 LETTERA --> CARATTERE DI CONTROLLO\n\n");

    }

    public static void mostraGiorno() {     //serve all'utente per controllare se i documenti sono scaduti

        // metodo che mostra la data odierna 
        System.out.println(Partita.getData());
        InterazioniUtente.scegliDaMenu();
    }

    public static void haiVinto(){
        System.out.println(TestoPersonalizzato.testoVerdeegrosso("\n\tHAI VINTO!"));
    }

    public static void haiPerso(){
        System.out.println(TestoPersonalizzato.testoRossoeGrosso("\n\tHAI PERSO!"));
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
                "dell'Accoglienza presso il presidio di frontiera Muskalf per il\n\tcollocamento immediato. \n\tAlla tua famiglia verrà "
                + //
                "assegnato un appartamento di classe 8 a Muskalf Est.\r\n\n" +
                TestoPersonalizzato.testoBluegrosso("\tBUON LAVORO E GLORIA AL BURMINI!\n\n "));
    }

    public static void visualizzaInizioGiorno(int giornoCorrente){
        System.out.print( TestoPersonalizzato.ANSI_BOLD + "\nGIORNO " + giornoCorrente + " DATA: ");
        System.out.println(Partita.getData() + TestoPersonalizzato.ANSI_NORMAL);
        System.out.println("\n");
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

    public static boolean sicuroDiUscire() {
        if(InputData.readYesOrNo("Sei sicuro di uscire dal programma? ")){
            return true;
        }
        return false;
    }

   


}
