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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLuogoDiNascita() {
        return luogoDiNascita;
    }

    public void setLuogoDiNascita(String luogoDiNascita) {
        this.luogoDiNascita = luogoDiNascita;
    }

    public String getcF() {
        return cF;
    }

    public void setcF(String cF) {
        this.cF = cF;
    }

    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }

    public boolean isSceltaUtente() {
        return sceltaUtente;
    }

    public void setSceltaUtente(boolean sceltaUtente) {
        this.sceltaUtente = sceltaUtente;
    }

    
    
}
