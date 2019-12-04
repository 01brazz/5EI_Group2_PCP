/*
 *  USER TO USER
 * Una volta connesso al server, l'utente dovrà conoscere il nome dell'altro utente per chattare direttamente con lui.
 * Invia inoltre l'ID univoco inviato durante l'inizializzazione della connessione.
 * Se la lunghezza del messaggio è maggiore di [2043 - lunghezza alias] significa che il messaggio è stato suddiviso tra più pacchetti. 
 * L'ultimo pacchetto viene notificato con un messaggio di lunghezza inferiore a 2043 - alias lunghezza. 
 * Se il contenuto risulta in un multiplo di questo numero, verrà inviato un pacchetto vuoto per notificare la fine della trasmissione.
 */
package pacchetti;

import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author Andrea
 */
public class Packet01 {

    private byte[] id;
    private String Alias;
    private String Message;

    public Packet01(byte[] id, String Alias, String Message) {
        this.id = id;
        this.Alias = Alias;
        this.Message = Message;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    //metodo per creare pacchetto
    public byte[] createP() {
        byte[] UserToUser = new byte[2048];

        int i = 0;
        UserToUser[i] = 01;

        for (byte b : this.id) {
            UserToUser[i++] = b;
        }

        for (byte b : this.Alias.getBytes()) {
            UserToUser[i++] = b;
        }

        UserToUser[i++] = 0;

        for (byte b : this.Message.getBytes()) {
            UserToUser[i++] = b;
        }

        UserToUser[i++] = 0;

        return UserToUser;
    }

    public String interpretaP(byte[] pacchetto) {
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

        String sourceAlias = Base64.getEncoder().encodeToString(sourceAliasByte);
        String message = Base64.getEncoder().encodeToString(messageByte);

        return (sourceAlias + ":" + message);
    }
}
