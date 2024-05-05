import org.fusesource.jansi.AnsiConsole;


public class TestoPersonalizzato {

 public static final String ANSI_CLS = "\u001b[2J";
  public static final String ANSI_HOME = "\u001b[H";
  public static final String ANSI_BOLD = "\u001b[1m";
  public static final String ANSI_AT55 = "\u001b[10;10H";
  public static final String ANSI_REVERSEON = "\u001b[7m";
  public static final String ANSI_NORMAL = "\u001b[0m";
  public static final String ANSI_WHITEONBLUE = "\u001b[37;44m";

    public static String testoRossoeGrosso(String testo){

         AnsiConsole.systemInstall();
        String testoModificato =ANSI_BOLD+"\u001B[31m"+ testo +"\u001B[0m"+ ANSI_NORMAL;//per avere il testo rosso
        AnsiConsole.systemUninstall();
        return testoModificato;
    }

    public static String testoVerdeegrosso(String testo){

        AnsiConsole.systemInstall();
       String testoModificato =ANSI_BOLD +"\u001b[32m"+ testo + ANSI_NORMAL;//per avere il testo verde
       AnsiConsole.systemUninstall();
       return testoModificato;
   }
}



