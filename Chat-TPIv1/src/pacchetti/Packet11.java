/*
* DISCONNECTION
* La disconnessione può avvenire sia dal client che dal server.
* CLIENT
* Inviato quando il client desidera disconnettersi dal server.
*
* SERVER
* inviato dal server con i seguenti codici operativi possibili:
*
* 0 nessun motivo
* 1 timeout
* Questo pacchetto viene inviato dopo 15 minuti di inattività del client.
* 2 server offline
*/
package pacchetti;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class Packet11 {

    private byte[] id;

    public Packet11(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    //metodo per creare pacchetto
    public byte[] createP() {
        byte[] UserToUser = new byte[2048];

        int i = 0;
        UserToUser[i++] = 11;

        for (byte b : this.id) {
            UserToUser[i++] = b;
        }
        return UserToUser;
    }
    
    public byte[] interpretaP(byte[] pacchetto){
    byte[] aliasC = Arrays.copyOfRange(pacchetto, 1, pacchetto.length);
   
    return aliasC;
    }
}
