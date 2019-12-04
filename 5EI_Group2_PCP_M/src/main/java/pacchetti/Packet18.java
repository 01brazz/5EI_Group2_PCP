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

    private byte[] id;
    private String old_Alias;
    private String new_Alias;

    public Packet18(byte[] id,
            String old_Alias,
            String new_Alias) {
        this.id = id;
        this.old_Alias = old_Alias;
        this.new_Alias = new_Alias;
    }

    public byte[] getId() {
        return id;
    }

    public String getOld_Alias() {
        return old_Alias;
    }

    public String getNew_Alias() {
        return new_Alias;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public void setOld_Alias(String old_Alias) {
        this.old_Alias = old_Alias;
    }

    public void setNew_Alias(String new_Alias) {
        this.new_Alias = new_Alias;
    }

    public byte[] createP() {
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i] = 18;

        for (byte b : this.id) {
            packet[i++] = b;
        }
        for (byte b : this.old_Alias.getBytes()) {
            packet[i++] = b;
        }

        for (byte b : this.new_Alias.getBytes()) {
            packet[i++] = b;
        }

        return packet;
    }
}
