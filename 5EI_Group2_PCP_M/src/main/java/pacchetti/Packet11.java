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

    //metodo per creare pacchetto
    public static byte[] createP(byte[] id) {
        byte[] UserToUser = new byte[3];

        int i = 0;
        UserToUser[i++] = 11;

        for (byte b : id) {
            UserToUser[i++] = b;
        }
        return UserToUser;
    }

    public static void interpretaP(byte[] pacchetto) {

        String reason = new String();

        switch (pacchetto[1]) {
            case (0):
                reason = ("no reason");
            case (1):
                reason = ("timeaout");
            case (2):
                reason = ("server gone offline");
        }
        System.out.println(reason);
    }
}
