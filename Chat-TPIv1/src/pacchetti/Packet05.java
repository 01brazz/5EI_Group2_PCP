/*
* USER TO CHAT   
* L'utente invia questo messaggio alla chat room a cui è stata connessa l'ultima volta.
* Se il messaggio è maggiore di [2044] significa che il messaggio è stato suddiviso tra più pacchetti. L'ultimo pacchetto è inferiore al 2044.
* Il client di destinazione riceverà quindi un pacchetto con l'alias di destinazione modificato in alias di origine e nessun id.
*/
package pacchetti;


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
        int i = 0;
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
}
