/*
* REGISTRATION ACK
*inviato dopo che un utente ha richiesto una connessione. 
* Assegna un ID all'utente e invia nuovamente l'alias per confermare la correttezza.
*/
package pacchetti;

import java.util.*;


/**
 *
 * @author 17726
 */
public class Packet20 {
    private byte[] pacchetto;
    private String alias;

    public Packet20(byte[] pacchetto, String alias) {
        this.pacchetto = pacchetto;
        this.alias = alias;
    }

    public byte[] getPacchetto() {
        return pacchetto;
    }

    public void setPacchetto(byte[] pacchetto) {
        this.pacchetto = pacchetto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public byte[] interpretaP() {
        byte[] aliasC = Arrays.copyOfRange(pacchetto,3,pacchetto.length-1);
        return aliasC;  
        }
}