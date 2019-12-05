/*
 * REGISTRATION PACKET
 * Il primo pacchetto inviato dal client al superclient-server locale è un pacchetto di registrazione. 
 * Questo pacchetto indica al server l'alias dell'utente (soprannome), utilizzato per identificare in modo univoco un utente in un dominio e l'argomento facoltativo a cui connettersi.
 * Se non viene passato alcun argomento, il server assumerà una connessione solo per le conversazioni private.
 * L'argomento predefinito da connettere all'aula generale è "generale", altri argomenti generano un errore in questa versione del protocollo
 */
package pacchetti;

/**
 *
 * @author Degio & Bruse
 */
public class Packet10 {

    public static byte[] createP(String Alias, String Topic) {
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i] = 10;
        packet[i++] = 0;
        for (byte b : Alias.getBytes()) {
            packet[i++] = b;
        }

        for (byte b : Topic.getBytes()) {
            packet[i++] = b;
        }

        return packet;
    }
}
