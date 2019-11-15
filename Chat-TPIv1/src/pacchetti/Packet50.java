/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

/**
 *
 * @author 17726
 */
public class Packet50 {

    private byte[] id;

    public Packet50(byte[] id) {
        this.id = id;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] createP() {           //metodo creazione pacchetto
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i++] = 50;               //opcode
        for (byte b : this.id) {        //id
            packet[i++] = b;
        }
        return packet;
    }
}
