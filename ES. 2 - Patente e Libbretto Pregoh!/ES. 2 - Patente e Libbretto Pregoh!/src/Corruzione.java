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
        if(probabilita<=70){
            System.out.println(TestoPersonalizzato.testoRossoeGrosso("La persona che hai fatto entrare era un RIVOLUZIONARIO, ora la comunità ne subirà le conseguenze"));
            }
        else {
            System.out.println(TestoPersonalizzato.testoRossoeGrosso(" \"Ci sono guai per lei...\" la persona mostra il documento_ \"POLIZIA IN BORGHESE\" "));
            Governo.grandeMultaPerCorruzione();
        }
    }
}