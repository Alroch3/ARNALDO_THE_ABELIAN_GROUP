public class StatusDoganiere{

    private static final float TASSE= 200;
    //conto, valore iniziale
    private static double risparmi=300;
    private static double conto=300;
    private static double contMulte=0;
    private static double stipendio=0;
    private static double contTasse = 0;
    private static double contMazzette = 0;

    public static void pagaMulta(double daPagare){
        contMulte += daPagare;
    }

    
    public static void pagaMultaPerCorruzione() {
        double multaPerCorruzione= risparmi*60/100;
        contMulte += multaPerCorruzione;
        System.out.printf("devi pagare %.0f$\n", multaPerCorruzione);
      }

    public static void pagaTasse(){
        contTasse = TASSE;
    }

    public static void aggiungiMazzette(){
        contMazzette += Corruzione.getMazzetta();
        Corruzione.setMazzetta(0);
    }
    

    //DA PROGETTARE GESIONE FINALI!!
    public static void disponibilitaSulConto(double conto){
        if (conto < 0){
            System.out.println("Il tuo saldo è insufficiente, non puoi effettuare il pagamento");
            Finali.nonPuoPagare();
            System.out.println("Sembra che tu abbia appena scambiato la tua divisa da guardia di confine per una tuta arancione!\n"
            + TestoPersonalizzato.testoBluegrosso("\n\t||||||||||||||||||||||||||||| SEI IN STATO DI ARRESTO |||||||||||||||||||||||||||||\n\n\n"));
        }
    }
    public static void aggiornaStipendio(int numPersonePassate){
        stipendio = Governo.getStipendioPerGiorno()*numPersonePassate;
    }

    public static void calcolaConto(){
        conto = risparmi + stipendio + contMazzette - contMulte - contTasse;
    }

    public static void aggiornaRisparmi(){
        disponibilitaSulConto(conto);
        risparmi = conto;
        contMulte = 0;
        stipendio = 0;
        contTasse = 0;
        contMazzette = 0;
    }

    public static double getConto() {
        return conto;
    }
    //metodi: aggiornaConto ..

    public static String toString(int numGiorno) {          //il toString stampa il report a fine giornata
        StringBuffer report = new StringBuffer();
        report.append("\nREPORT GIORNALIERO: \n");
        report.append(String.format("Fine del GIORNO %d \n", numGiorno));
        report.append(String.format("RISPARMI: %.0f\n", risparmi));
        report.append(String.format("STIPENDIO: %.0f\n", stipendio));
        if(contMazzette!=0){
            report.append(String.format("MAZZETTE: %.0f\n", contMazzette));
        }
        if(contMulte!=0){
            report.append(String.format("MULTE: %.0f\n", contMulte));
        }
        if(contTasse != 0){
            report.append(String.format("TASSE: %.0f \n", TASSE));
        }
        report.append(String.format("TOT: %.0f \n", conto));
        return report.toString();
    }
}
