public class Controllore {

  private boolean giudizioScelta= false;
  private boolean risultatoControllo = false;


//------------------------------------------------------------------------------------------------------------------------------------------------------------------
public  boolean seAccetta(Persona personaAccettata){  //il metodo controlla la persona e se l'utente ha fatto la scelta giusta ritorna true altrimenti false

   boolean risultato = controllaDatiPersona(personaAccettata);

  if(risultato == true  ){ //ovvero se i dati sono giusti e l'utente ha accettato allora ritornerà true altrimenti false 

    giudizioScelta = true;

  }else{

    giudizioScelta = false;

  }

 return giudizioScelta;
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

public  boolean seRifiuta(Persona personaRifutata){ //il metodo controlla la persona e se l'utente ha fatto la scelta giusta ritorna true altrimenti false

   boolean risultato = controllaDatiPersona(personaRifutata);
    
   if(risultato != false  ){ //ovvero se i dati sono sbagliati e l'utente ha rifiutati allora ritornerà true altrimenti false 

    giudizioScelta = true;

  }else{

    giudizioScelta = false;

  }
   
   return  giudizioScelta; 

  }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

public boolean controllaDatiPersona(Persona personaDaControllare){ // il metodo controlla i dati della persona se sono giusti o sbagliati


  //ANCORA DA IMPLEMENTARE 

  return risultatoControllo;//TRUE SE I DATI SONO CORRETTI , FALSE SE SONO SBAGLIATI

}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------
}
