import it.kibo.*;
import it.kibo.fp.lib.Menu;
import it.kibo.fp.lib.RandomDraws;

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
        //gestire l'uscita dal gioco
        break;
    }
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
