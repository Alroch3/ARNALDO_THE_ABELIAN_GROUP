import java.time.LocalDate;

public class Controllore {

  private static boolean giudizioScelta= false;
  private static boolean risultatoControllo = false;


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

public static boolean controllaDatiPersona(Persona p, LocalDate giornoCorrente){      //metodo che controlla se il codice fiscale della persona è valido
  if(posizioniCorretteCF(p.getcF()) && (p.getSesso().equals(validitaGiornoESesso(p.getcF()))) && meseValido(p.getcF(), giornoCorrente)){
    return true;
  }
  return false;
}



private static String validitaGiornoESesso(String CF) {                           //questo metodo fa 2 controlli, il primo è se il giorno di nascita è valido e il secondo se è maschio o femmina perchè nel CF le donne hanno il numero di nascita aumentato di 40
  int giorno = Integer.parseInt(CF.substring(9, 11));       //qui trasformo in un intero il numero del giorno che viene estrapolato con CF.substring
  if(giorno >= 1 && giorno <=31){
    return "M";
  }
  if(giorno >= 41 && giorno <= 71){
    return "F";
  }
  return "I";

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

private static boolean meseValido(String CF, LocalDate giornoCorrente){
  final String lettereConsentitePerMese = "ABCDEHLMPRST";                               //questo attributo specifica quali lettere sono consentite nel mese del CF
  if(lettereConsentitePerMese.contains(Character.toString(CF.charAt(8)))){        //questo verifica se il carattere del mese, all'interno del codice fiscale è uno dei caratteri possibili      
    if(Character.toString(CF.charAt(8)).equals(Character.toString(lettereConsentitePerMese.charAt(giornoCorrente.getMonthValue())))){
      return true;
    }
  }
  return false;
}

}
