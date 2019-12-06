/*
 * REGISTRATION ACK
 *inviato dopo che un utente ha richiesto una connessione. 
 * Assegna un ID all'utente e invia nuovamente l'alias per confermare la correttezza.
 */
package pacchetti;

import java.util.*;
import repository.Repository;

/**
 *
 * @author 17726
 */
public class Packet20 {

    private static byte[] ID;

    public static byte[] getID() {
        return ID;
    }

    public static void interpretaP(byte[] pacchetto, String alias) {
        byte[] AliasC = Arrays.copyOfRange(pacchetto, 3, pacchetto.length - 1);

        ID = Arrays.copyOfRange(pacchetto, 1, 3);

        if (AliasC == alias.getBytes()) {
            System.out.println("Alias corretto");
        } else {
            System.out.println("Alias NON corretto");
        }
    }
}
