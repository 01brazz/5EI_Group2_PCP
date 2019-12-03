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

    private String Alias;
    private String Topic;

    public Packet10(String Alias,
            String Topic) {
        this.Alias = Alias;
        this.Topic = Topic;
    }

    public String getAlias() {
        return Alias;
    }

    public String getTopic() {
        return Topic;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public byte[] createP() {
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i] = 10;
        packet[i++] = 0;
        for (byte b : this.Alias.getBytes()) {
            packet[i++] = b;
        }

        for (byte b : this.Topic.getBytes()) {
            packet[i++] = b;
        }

        return packet;
    }
}
