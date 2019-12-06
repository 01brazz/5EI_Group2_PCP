/*
 * GROUP USER LIST REQUESTS
 *Inviato per richiedere l'intero elenco di utenti del gruppo da un client.
 */
package pacchetti;

/**
 *
 * @author 17726
 */
public class Packet50 {

    public static byte[] createP(byte[] id) {           //metodo creazione pacchetto
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i] = 50;               //opcode
        for (byte b : id) {        //id
            packet[i++] = b;
        }
        return packet;
    }
}
