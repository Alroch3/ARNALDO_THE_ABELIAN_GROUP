public class Persona {

    private String nome;
    private String cognome;
    private String sesso;
    private String data;
    private String luogoDiNascita;
    private String cF;
    private String scadenza;
    private boolean sceltaUtente;       //scelta di ingresso o meno della persona da parte dell'utente ( non quella giusta )

    public Persona(String nome, String cognome, String sesso, String data, String luogoDiNascita, String cF,
            String scadenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.data = data;
        this.luogoDiNascita = luogoDiNascita;
        this.cF = cF;
        this.scadenza = scadenza;
    }
    
}
