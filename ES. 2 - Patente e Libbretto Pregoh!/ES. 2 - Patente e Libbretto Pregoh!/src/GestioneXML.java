import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class GestioneXML {

    private static boolean elementoTrovato = false;                             //booleano che ci dice se la persona selezionata dall'indice è stata trovata nell'XML

    // METODO MAIN PER STAMPA -- SOLO DEBUG!
    /*
     * public static void main(String[] args) {
     * Scanner in = new Scanner(System.in);
     * System.out.print("Read (0) or Write (1)? ");
     * int read = in.nextInt();
     * 
     * if (read == 0)
     * new GestioneXML().creaPersonaDaXML();
     * 
     * if (read == 1)
     * //new GestioneXML().writeXML();
     * 
     * in.close();
     * }
     */

    public static Persona creaPersonaDaXML(String idPersonaCercata) {    //Metodo che crea una persona con i dati presi dall'xml di una persona, la selezione della persona dell'XML avviene tramite il passaggio dell'indice alla chiamata del metodo creaPersonaDaXML
        final String filename = "src\\XML\\IDpersone.xml";                      //CLASSPATH XML IDpersone --NON MODIFICARE!--      
        XMLInputFactory xmlif = null;
        XMLStreamReader xmlr = null;

        Persona p = new Persona("", "", "", "", "", "", "");
        boolean elementoTrovato = false;                             //booleano che ci dice se la persona selezionata dall'indice è stata trovata nell'XML

        try (FileInputStream reader = new FileInputStream(filename)) {
            xmlif = XMLInputFactory.newInstance();
            xmlr = xmlif.createXMLStreamReader(filename, reader);
            try {

                /*
                 * QUESTO CODICE STAMPA NEL TERMINALE LA PERSONA SELEZIONATA -- SOLO DEBUG
                 * 
                 * while(!elementoTrovato){
                 * if(xmlr.getEventType() == XMLStreamConstants.START_ELEMENT){
                 * if(xmlr.getLocalName().equals("persona") &&
                 * xmlr.getAttributeValue(0).equals(elementoCercato)){
                 * xmlr.next();
                 * while(!(xmlr.getEventType() == XMLStreamConstants.END_ELEMENT &&
                 * xmlr.getLocalName().equals("scadenza_documento"))){
                 * if(xmlr.getEventType() == XMLStreamConstants.START_ELEMENT){
                 * System.out.print(xmlr.getLocalName() + " ");
                 * }
                 * if(xmlr.getEventType() == XMLStreamConstants.CHARACTERS){
                 * System.out.print(xmlr.getText());
                 * }
                 * xmlr.next();
                 * }
                 * elementoTrovato = true;
                 * }
                 * }
                 * xmlr.next();
                 * }
                 */

                while (!elementoTrovato) {
                    if (xmlr.getEventType() == XMLStreamConstants.START_ELEMENT) {                      //verifica se ciò che sta leggendo è l'inizio di un tag
                        if (xmlr.getLocalName().equals("persona")                              //verifica che il nome del tag sia persona
                                && xmlr.getAttributeValue(0).equals(idPersonaCercata)) {          //verifica inoltre che il valore dell'unico attributo (lo 0) del tag sia l'id della persona cercata che viene passata come parametro al metodo 
                            xmlr.next();
                            while (!(xmlr.getEventType() == XMLStreamConstants.END_ELEMENT              //questo ciclo continua fino a quando non sta leggenco la fine del tag scadenza documento che è l'ultimo tag che vogliamo leggere della persona selezionata
                                    && xmlr.getLocalName().equals("scadenza_documento"))) {
                                if (xmlr.getEventType() == XMLStreamConstants.START_ELEMENT) {
                                    switch (xmlr.getLocalName()) {                                      //questo switch verifica qual'è il nome dell'attributo che sto leggendo
                                        case "nome":
                                            xmlr.next();        
                                            p.setNome(xmlr.getText());                                  //qui viene settato il nome (in questo caso) della persona passata come parametro al metodo con il testo del tag selezionato e così via con i prossimi
                                            break;
                                        case "cognome":
                                            xmlr.next();
                                            p.setCognome(xmlr.getText());
                                            break;
                                        case "sesso":
                                            xmlr.next();
                                            p.setSesso(xmlr.getText());
                                            break;
                                        case "data_nascita":
                                            xmlr.next();
                                            p.setData(xmlr.getText());
                                            break;
                                        case "comune_nascita":
                                            xmlr.next();
                                            p.setLuogoDiNascita(xmlr.getText());
                                            break;
                                        case "codice_fiscale":
                                            xmlr.next();
                                            p.setcF(xmlr.getText());
                                            break;
                                        case "scadenza_documento":
                                            xmlr.next();
                                            p.setScadenza(xmlr.getText());
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                xmlr.next();
                            }
                            elementoTrovato = true;                              //Dato che è stata trovata la persona con l'id desiderato imposto true questo flag cosi esco dal primo while
                        }
                    }
                    xmlr.next();
                }
                xmlr.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        } catch (FactoryConfigurationError | XMLStreamException | IOException e) {
            System.out.println("Error in initializing the reader:");
            System.out.println(e.getMessage());
        }
        return p;
    }

    public static String cercaComuneDaXML(String nomeComune){                //questo metodo prende come parametro il nome di un comune e restituisce il codice corrispondente del codice fiscale
        final String filename = "src\\XML\\comuni.xml";                      //CLASSPATH XML comuni --NON MODIFICARE!--      
        XMLInputFactory xmlif = null;
        XMLStreamReader xmlr = null;

        boolean elementoTrovato = false;
        String risultato = "";

        try (FileInputStream reader = new FileInputStream(filename)) {
            xmlif = XMLInputFactory.newInstance();
            xmlr = xmlif.createXMLStreamReader(filename, reader);
            try {
                while (!elementoTrovato) {
                    
                    while(!(xmlr.getEventType() == XMLStreamConstants.START_ELEMENT && xmlr.getLocalName().equals("nome"))){
                        xmlr.next();
                    }
                    while(!(xmlr.getEventType() == XMLStreamConstants.CHARACTERS && xmlr.getText().equals(nomeComune))){
                        xmlr.next();
                        if(xmlr.getEventType() == XMLStreamConstants.END_DOCUMENT){                                             //questo if è importante perchè fa in modo di non incorrere nell'eccezione : "NoSuchElementException" se il comune cercato non c'è nell'elenco
                            return risultato = "comune non esistente";
                        } 
                    }
                    while(!(xmlr.getEventType() == XMLStreamConstants.START_ELEMENT && xmlr.getLocalName().equals("codice"))){
                        xmlr.next();
                    }
                    while(!(xmlr.getEventType() == XMLStreamConstants.CHARACTERS)){
                        xmlr.next();
                    }
                    risultato = xmlr.getText();
                    elementoTrovato = true; 
                }
                xmlr.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        } catch (FactoryConfigurationError | XMLStreamException | IOException e) {
            System.out.println("Error in initializing the reader:");
            System.out.println(e.getMessage());
        }
        return risultato;
    }

}
