/*
 *  USER TO USER
 * Una volta connesso al server, l'utente dovrà conoscere il nome dell'altro utente per chattare direttamente con lui.
 * Invia inoltre l'ID univoco inviato durante l'inizializzazione della connessione.
 * Se la lunghezza del messaggio è maggiore di [2043 - lunghezza alias] significa che il messaggio è stato suddiviso tra più pacchetti. 
 * L'ultimo pacchetto viene notificato con un messaggio di lunghezza inferiore a 2043 - alias lunghezza. 
 * Se il contenuto risulta in un multiplo di questo numero, verrà inviato un pacchetto vuoto per notificare la fine della trasmissione.
 */
package pacchetti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import repository.Repository;

/**
 *
 * @author Andrea
 */
public class Packet01 {

    //metodo per creare pacchetto
    public static byte[] createP(byte[] id, String Alias, String Message) {
        byte[] UserToUser = new byte[2048];
        int i = 0;
        UserToUser[i] = 01;
        for (byte b : id) {
            UserToUser[i++] = b;
        }
        for (byte b : Alias.getBytes()) {
            UserToUser[i++] = b;
        }
        UserToUser[i++] = 0;
        for (byte b : Message.getBytes()) {
            UserToUser[i++] = b;
        }
        UserToUser[i++] = 0;
        return UserToUser;
    }

    public static ArrayList interpretaP(byte[] pacchetto) {
        byte[] sourceAliasByteOp = new byte[2048];
        int i = 0;
        for (byte b : pacchetto) {
            if (b == 0) {
                break;
            } else {
                sourceAliasByteOp[i++] = b;
            }
        }
        byte[] sourceAliasByte = Arrays.copyOfRange(sourceAliasByteOp, 1, sourceAliasByteOp.length);
        byte[] messageByte = Arrays.copyOfRange(pacchetto, i++, pacchetto.length - 1);

        String sourceAlias = Arrays.toString(sourceAliasByte);
        String message = Arrays.toString(messageByte);
        ArrayList<String> dati = new ArrayList();
        dati.add(sourceAlias);
        dati.add(message);
        return dati;
    }
}
