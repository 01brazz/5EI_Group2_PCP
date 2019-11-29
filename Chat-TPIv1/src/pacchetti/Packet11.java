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
    
    public String interpretaP(byte[] pacchetto){
        byte[] reasonByte = Arrays.copyOfRange(pacchetto, 1, pacchetto.length);
        
        String reason;
        
        
        
        
        switch (reasonByte){
            case (0):
                reason = ("no reason");
            case (1):
                reason = ("timeaout");
            case (2):
                reason = ("server gone offline");    
        }
        
    
    return reason ;
    }
}
