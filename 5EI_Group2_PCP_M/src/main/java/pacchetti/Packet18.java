/*
 * CHANGE OF ALIAS 
 *Un utente potrebbe voler cambiare il suo alias. Questo pacchetto consente di farlo.
 */
package pacchetti;

/**
 *
 * @author Degio
 */
public class Packet18 {

    public static byte[] createP(byte[] id,String old_Alias,String new_Alias) {
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i] = 18;

        for (byte b : id) {
            packet[i++] = b;
        }
        for (byte b : old_Alias.getBytes()) {
            packet[i++] = b;
        }

        for (byte b : new_Alias.getBytes()) {
            packet[i++] = b;
        }

        return packet;
    }
}
