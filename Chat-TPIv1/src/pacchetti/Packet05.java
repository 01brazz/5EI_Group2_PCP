/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

import java.net.*;
import java.io.*;

/**
 *
 * @author david
 */
public class Packet05 {

    private byte[] id;
    private String message;

    public Packet05(byte[] id, String message) {
        this.id = id;
        this.message = message;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] createP() {           //metodo creazione pacchetto
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i++] = 05;               //opcode
        for (byte b : this.id) {        //id
            packet[i++] = b;
        }
        for (byte b : this.message.getBytes()) {
            packet[i++] = b;            //message
        }
        packet[i++] = 0;                //1 byte

        return packet;
    }
}
