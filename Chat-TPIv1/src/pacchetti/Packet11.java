/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public byte[] interpretaP(byte[] pacchetto) {
        byte[] aliasC = Arrays.copyOfRange(pacchetto, 1, pacchetto.length);

        return aliasC;
    }
}
