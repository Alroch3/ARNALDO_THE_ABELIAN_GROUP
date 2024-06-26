public class Persona {

    private String nome;
    private String cognome;
    private String sesso;
    private String data;
    private String luogoDiNascita;
    private String cF;
    private String scadenza;
    private boolean sceltaUtente;       //scelta da parte dell'utente ( non quella giusta ) SERVE PER IL DIARIO

    public Persona(String nome, String cognome, String sesso, String data, String luogoDiNascita, String cF,
            String scadenza, boolean sceltaUtente) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.data = data;
        this.luogoDiNascita = luogoDiNascita;
        this.cF = cF;
        this.scadenza = scadenza;
        this.sceltaUtente = sceltaUtente;
    }

    @Override
    public String toString() {                      //Questo toString visualizzerà i dati della persona che arriverà al confine, modificare il layout 
        return ("Nome: " + getNome() + "\n" 
        + "Cognome: " + getCognome() + "\n"
        + "Sesso: " + getSesso() + "\n"
        + "Data di nascita: " + getData() + "\n"
        + "Luogo di nascita: " + getLuogoDiNascita() + "\n"
        + "CF: " + getcF() + "\n"
        + "Scadenza documento: " + getScadenza());
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

    public boolean getSceltaUtente() {
        return sceltaUtente;
    }

    public void setSceltaUtente(boolean sceltaUtente) {
        this.sceltaUtente = sceltaUtente;
    }

    
    
}
