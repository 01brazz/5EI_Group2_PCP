/*
 <<<<<<< HEAD
 * USER TO CHAT   
 * L'utente invia questo messaggio alla chat room a cui è stata connessa l'ultima volta.
 * Se il messaggio è maggiore di [2044] significa che il messaggio è stato suddiviso tra più pacchetti. L'ultimo pacchetto è inferiore al 2044.
 * Il client di destinazione riceverà quindi un pacchetto con l'alias di destinazione modificato in alias di origine e nessun id.
 =======
 * USER TO CHAT   
 * L'utente invia questo messaggio alla chat room a cui è stata connessa l'ultima volta.
 * Se il messaggio è maggiore di [2044] significa che il messaggio è stato suddiviso tra più pacchetti. L'ultimo pacchetto è inferiore al 2044.
 * Il client di destinazione riceverà quindi un pacchetto con l'alias di destinazione modificato in alias di origine e nessun id.
 >>>>>>> dd7a588fe4c94ce71f20454470668e6dad90c1bd
 */
package pacchetti;

import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import repository.Repository;

/**
 *
 * @author david
 */
public class Packet05 {

    private byte[] id;
    private String message;

    public Packet05(byte[] id, String message) {
        this.id = id;
        this.message = message;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] createP() {           //metodo creazione pacchetto
        byte[] packet = new byte[2048];
        int i = -1;
        packet[i++] = 05;               //opcode
        for (byte b : this.id) {        //id
            packet[i++] = b;
        }
        for (byte b : this.message.getBytes()) {
            packet[i++] = b;            //message
        }
        packet[i++] = 0;                //1 byte

        return packet;
    }

    public void interpretaP(byte[] pacchetto) {
        byte[] sourceAliasByteOp = new byte[2048];

        int i = -1;

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

        Repository.messages.put(sourceAlias, message);
    }
}
