import java.util.Scanner;

public class InterazioniUtente {

private Scanner scanner = new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------------------
public void erroreDiScelta(){ 

    System.out.println("numero di opzione non valido, riprova");

}

//-------------------------------------------------------------------------------------------------------------------------------

public void faiScelta(){ // metodo che mostra l'interfaccia della scelta, permette all'utente di scegliere se far entrare o no la persona e di aprire il menu

   Display.mostraInterfacciaScelta();
   System.out.println("\n 0.RIFIUTARE  1.ACCETTARE  2.Menu");
   System.out.print("scelta: ");
   int scelta = scanner.nextInt();
   
  switch(scelta){
    
    case 0:  
        System.out.println("entrata rifiutata");
        seRifiuta(); //metodo dalla classe controllore (da creare)

    break;

    case 1 :
         System.out.println("entrata accettata");
        seAccetta(); //metodo dalla classe controllore (dac creare)
    break;

    case 2 :
        sceltaMenu();
    break;

    default:
      erroreDiScelta();
      faiScelta();
  }
  
}

//--------------------------------------------------------------------------------------------------------------------------------


  public void sceltaMenu(){// metodo che permette di scegliere un opzione del menu
 
    Display.visualizzaMenu();
   int opzione = scanner.nextInt();

   switch(opzione){

    case 1:
    Display.mostraRegolamento();
    break;

    case 2:
    Display.mostraGiorno();
    break;


    case 3:
    Display.mostraComuni();
    break;


    case 4:
    Display.mostraContoResiduo();
    break;


    case 5:
    Display.mostraGiorniRimanenti();
    break;


    case 6:
    faiScelta();// nel cliccare prosegui si ritorna a decidere se approvare o rifiutare la persona 
    break;

    default:
    erroreDiScelta();
    sceltaMenu();

   }

  }

//-----------------------------------------------------------------------------------------------------------------------------------

}
