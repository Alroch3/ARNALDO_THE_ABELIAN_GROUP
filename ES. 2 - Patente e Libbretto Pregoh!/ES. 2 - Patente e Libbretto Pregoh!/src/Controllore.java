import java.time.LocalDate;

// ROBERTO

public class Controllore extends Partita{

  private static boolean giudizioScelta= false;
  private static boolean risultatoControllo = false;

 
 /**
  * To: Roberto
  * @author Gaia
  *  Motivo: comodità nell'output da manipolare con altri metodi
  *  Azione: ho commentato i due metodi seAccetta/Rifiuta e ne ho creato uno solo equivalente
  */

  public static boolean controllaPersona(Persona persona, LocalDate giornoCorrente){  
    if(controllaDatiPersona(persona, giornoCorrente) == true)
    return true; //I dati sono corretti
    else return false; //I dati sono sbagliati
 }
  /*public static void main(String[] args) {
    Persona p = GestioneXML.creaPersonaDaXML(1);
    System.out.println(controllaDatiPersona(p));
  }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
  public static boolean seAccetta(Persona personaAccettata){  //il metodo controlla la persona e se l'utente ha fatto la scelta giusta ritorna true altrimenti false

    boolean risultato = controllaDatiPersona(personaAccettata);

    if(risultato == true  ){ //ovvero se i dati sono giusti e l'utente ha accettato allora ritornerà true altrimenti false 

      giudizioScelta = true;

    }else{

      giudizioScelta = false;

    }

  return giudizioScelta;
  }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

  public static boolean seRifiuta(Persona personaRifutata){ //il metodo controlla la persona e se l'utente ha fatto la scelta giusta ritorna true altrimenti false

   boolean risultato = controllaDatiPersona(personaRifutata);
    
   if(risultato == false  ){ //ovvero se i dati sono sbagliati e l'utente ha rifiutati allora ritornerà true altrimenti false 

    giudizioScelta = true;

  }else{

    giudizioScelta = false;

  }
   
   return  giudizioScelta; 

  }
*/
  // CONTROLLO CODICE FISCALE CON CONTROLLO INCROCIATO CON I DATI DELLA PERSONA

  public static boolean controllaDatiPersona(Persona p, LocalDate giornoCorrente){      //metodo che controlla se il codice fiscale della persona è valido
    if(posizioniCorretteCF(p.getcF()) && validitaGiornoESesso(p.getcF(), p.getSesso(), p.getData()) 
      && meseValido(p.getcF(), p.getData()) && annoValido(p.getcF(), p.getData()) && controlloComune(p.getcF(), p.getLuogoDiNascita())){
      return true;
    }
    return false;
  }

  private static boolean validitaGiornoESesso(String CF, String sesso, String data) {                           //questo metodo fa 3 controlli, il primo è se il giorno di nascita è valido e il secondo se è maschio o femmina perchè nel CF le donne hanno il numero di nascita aumentato di 40, infine verifica se il giorno di nascita nel codice fiscale coincide con quello riportato nell'xml
    int giorno = Integer.parseInt(CF.substring(9, 11));       //qui trasformo in un intero il numero del giorno che viene estrapolato con CF.substring
    String sessoPrevistoCF = " ";
    if(giorno >= 1 && giorno <=31){
      sessoPrevistoCF = "M";
    }
    if(giorno >= 41 && giorno <= 71){
      sessoPrevistoCF = "F";
    }
    if(sesso.equals(sessoPrevistoCF) && CF.substring(9, 11).equals(data.substring(8, 10))){
      return true;
    }
    return false;
    }
  

  private static boolean posizioniCorretteCF(String CF) {
    for(int i=0; i<16; i++){
      if((i>=0 && i<=5) || i==8 || i==15 || i==11){
        if(!Character.isLetter(CF.charAt(i))){
          return false;
        }
      }else{
        if(!Character.isDigit(CF.charAt(i))){
          return false;
        }
      }
    }
    return true;
  }

  private static boolean meseValido(String CF, String data){                              //questo metodo verifica due cose: la prima è la correttezza nella forma del mese nel CF e il secondo è se il mese sul CF coincide con il mese della persona selezionata
    final String lettereConsentitePerMese = "ABCDEHLMPRST";                               //questo attributo specifica quali lettere sono consentite nel mese del CF
    if(lettereConsentitePerMese.contains(Character.toString(CF.charAt(8)))){        //questo verifica se il carattere del mese, all'interno del codice fiscale è uno dei caratteri possibili      
      if(Character.toString(CF.charAt(8)).equals(Character.toString(lettereConsentitePerMese.charAt((Integer.parseInt(data.substring(5, 7))) - 1)))){
        return true;
      }
    }
    return false;
  }

  private static boolean annoValido(String CF, String data){
    String anno = data.substring(2, 4);
    String annoCF = CF.substring(6, 8);
    return anno.equals(annoCF);
  }

  private static boolean controlloComune(String CF, String comune){
    String siglaComuneCF = CF.substring(11, 15);
    return siglaComuneCF.equals(GestioneXML.cercaComuneDaXML(comune));
  }

}
