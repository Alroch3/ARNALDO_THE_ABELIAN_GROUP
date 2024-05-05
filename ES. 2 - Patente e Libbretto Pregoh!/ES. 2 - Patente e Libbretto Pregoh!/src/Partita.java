import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import it.kibo.fp.lib.*;


public class Partita {

    //creo un Array di giorni lavorativi
    private static GiornoLavorativo [] giorniPartita = new GiornoLavorativo[11];
    private static LocalDate dataIniziale = LocalDate.of(2024, 4, 26);
    private static int contatoreGiorni = 1;
    private static boolean statusGioco;
    
    //metodo da richiamare nel main per far andare il gioco!
    public static void gioco(){
        Display.visualizzaInterfacciaIniziale();

        if(InputData.readYesOrNo("\tVuoi visualizzare" + TestoPersonalizzato.testoRossoeGrosso(" il regolamento ") + "di gioco")){
            Display.mostraRegolamento();
        }
        //do while che segna lo scandire dei giorni
        do{
            creaGiorno(contatoreGiorni-1);
            Display.visualizzaInizioGiorno(contatoreGiorni);
            scelteDaMenu();
            Governo.daiStipendio(giorniPartita[contatoreGiorni-1].getNumPersonePassate());
            seSonoPassatiDueGiorni();
            contatoreGiorni++;
            statusGioco = Finali.dodicesimoGiorno();
            
        }while(statusGioco);

        Display.messaggioFinale();

        //REPORT
        //QUA BISOGNA STAMPARE IL DIARIO (OPPURE ALLA FINE DI OGNI GIORNATA)
    }

    private static void scelteDaMenu() {
        for(int i = 0; i < giorniPartita[contatoreGiorni-1].getNumPersonePassate(); i++){
            System.out.println(giorniPartita[contatoreGiorni-1].toString(i));
            InterazioniUtente.scegliDaMenu();   
        }
    }

    //alla fine del giorno mostrare: conto in banca, multe ecc.. 

    // AGGIUNGERE COMMENTI!!!!!!
    public static void creaGiorno(int indice){
        GiornoLavorativo nuovoGiorno = new GiornoLavorativo(dataIniziale.plusDays(indice));
        nuovoGiorno.creaArrayDiPersone();
        giorniPartita[indice] = nuovoGiorno;
    }

    public static void seSonoPassatiDueGiorni(){
        if (contatoreGiorni%2==0 && contatoreGiorni!=0) Governo.riscuoteTasse();
    }

    public static void setStatusGioco(boolean statusGioco) {
        Partita.statusGioco = statusGioco;
    }

    public static int getContatoreGiorni() {
        return contatoreGiorni;
    }

    public static String getData() {
        GiornoLavorativo nome = giorniPartita[contatoreGiorni];
        LocalDate data = nome.getGiornoCorrente();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormattata = data.format(formatter);
        return dataFormattata;
    }
}



    

