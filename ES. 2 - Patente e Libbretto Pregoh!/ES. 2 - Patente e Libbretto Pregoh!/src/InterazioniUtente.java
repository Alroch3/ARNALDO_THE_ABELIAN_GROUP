public class InterazioniUtente {

  private static final String MSG_ENTRATA_ACCETTATA = "ENTRATA ACCETTATA";
  private static final String MSG_ENTRATA_RIFIUTATA = "ENTRATA RIFIUTATA";

  
  public static void scegliDaMenu() {
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
      case 4:                             //Scelta di mostrare il regolamento
        Display.mostraGiorno();      
        break;
      case 0:
        uscitaDalGioco();
        break;
    }
  }

  private static void uscitaDalGioco() {
    if(Display.sicuroDiUscire()){
      System.exit(0);
    }else{
      InterazioniUtente.scegliDaMenu();
    }
  }
   
  public static void scegliDaMenuCorruzione() {
    int opzione = Display.visualizzaMenuCorruzione();
    switch (opzione) {
      case 1:                             //Entrata accettata
        seAccettaCorruzione();
        break;
      case 2:                             //Entrata rifiutata
        seRifiutaCorruzione();                      
        break;
    }
  }

  private static void seRifiutaCorruzione() {
    System.out.println("AAH, che brutta persona, te ne pentirai!!!");
  }

  private static void seAccettaCorruzione() {
    Corruzione.RivelaPersonaTentatrice();    
  }

  private static void seAccetta() {
    System.out.println(MSG_ENTRATA_ACCETTATA);
    Governo.daiMultaTrecento();
    
    //chiamata al controllore per verificare che i dati siano corretti, se il controllore ritorna falso chiamata alla classe governo per multa
  }  

  private static void seRifiuta() {
    System.out.println(MSG_ENTRATA_RIFIUTATA);
    //chiamata al controllore per verificare che i dati siano errati, se il controllore ritorna vero chiamata alla classe governo per multa
    Governo.daiMultaCentoCinquanta();
  }

  
}
