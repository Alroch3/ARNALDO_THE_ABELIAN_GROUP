import it.kibo.fp.lib.RandomDraws;

public class Corruzione {

    public static void provanoACorrompere() {
        int probabilita= RandomDraws.drawInteger(1, 100);
        if(probabilita<=40){
            int mazzetta= RandomDraws.drawInteger(250, 500);
            System.out.printf("Le offro questi soldi %d in cambio dell'entrata", mazzetta);
            InterazioniUtente.scegliDaMenuCorruzione();
            
          }
    }

    public static void RivelaPersonaTentatrice() {
        int probabilita= RandomDraws.drawInteger(1, 100);
        if(probabilita<=0){
            System.out.println("La persona che hai fatto entrare era un rivoluzionario, ora la comunità ne subirà le conseguenze");
            }
        else {
            System.out.println(" \"Ci sono guai per lei...\" la persona mostra il documento_ \"Polizia in borghese\" ");
            Governo.grandeMultaPerCorruzione();
        }
    }
}