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


    public static String interpretaP(byte[] pacchetto,String alias) {
        byte[] AliasC = Arrays.copyOfRange(pacchetto, 3, pacchetto.length - 1);
        
        if (AliasC == alias.getBytes()) {
           return "Alias corretto";
        } else {
           return "Alias non corretto";
        }
        
    }

    
}
