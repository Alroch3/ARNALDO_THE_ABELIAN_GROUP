public class InterazioniUtente {

  private static final String MSG_ENTRATA_ACCETTATA = "ENTRATA ACCETTATA";
  private static final String MSG_ENTRATA_RIFIUTATA = "ENTRATA RIFIUTATA";

  public static void sceltaMenu() {

    int opzione = Display.visualizzaMenu();
    switch (opzione) {
      case 1:                             //Entrata accettata
        seAccetta();
        break;
      case 2:                             //Entrata rifiutata
        seRifiuta();                      
        break;
      case 3:                             //Scelta di mostrare il regolamento
        Display.mostraRegolamento();      
        break;
      case 4:
        Display.mostraComuni();           //Scelta di mostrare l'elenco dei comuni
        break;
      case 0:
        //gestire l'uscita dal gioco
        break;
    }
  }

  private static void seRifiuta() {
    System.out.println(MSG_ENTRATA_RIFIUTATA);
  }

  private static void seAccetta() {
    System.out.println(MSG_ENTRATA_ACCETTATA);
  }
}
