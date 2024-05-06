import it.kibo.fp.lib.RandomDraws;

public class Corruzione {

    public static void provanoACorrompere() {
        int probabilita= RandomDraws.drawInteger(1, 100);
        if(probabilita<=40){
            int mazzetta= RandomDraws.drawInteger(250, 500);
            System.out.printf("\ntipo losco :\"Ehi, guarda questa foto del mio gatto. Non è adorabile? Oh, e guarda, c’è un biglietto da %d sbleuri attaccato dietro...\"\n", mazzetta);
            InterazioniUtente.scegliDaMenuCorruzione();
            
          }
    }

    public static void RivelaPersonaTentatrice() {
        int probabilita= RandomDraws.drawInteger(1, 100);
        if(probabilita<=70){
            System.out.println(TestoPersonalizzato.testoRossoeGrosso("C'era una volta UN RIVOLUZIONARIO...\nsi proprio quello che hai fatto entrare...\n")+ "\nOra il paese si prepara ad un esplosione di cambiamenti!");
            }
        else {
            System.out.println(TestoPersonalizzato.testoRossoeGrosso(" \"Ci sono guai per lei...\" la persona mostra il documento_ \"POLIZIA IN BORGHESE\" "));
            Governo.grandeMultaPerCorruzione();
        }
    }
}