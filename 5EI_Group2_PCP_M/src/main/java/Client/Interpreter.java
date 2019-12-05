/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Repository;
import pacchetti.Packet20;
import pacchetti.Packet11;
import pacchetti.Packet05;
import pacchetti.Packet255;
import pacchetti.Packet51;

/**
 *
 * @author 5ei
 */
public class Interpreter extends Thread {

    private byte[] packet;

    public Interpreter(byte[] packet) {
        this.packet = packet;
    }

    @Override
    public void run() {
        byte[] opcode = new byte[1];
        System.arraycopy(this.packet, 0, opcode, 0, 1);
        String op = Arrays.toString(opcode);

        switch (op) {
            case ("20"):
                Packet20 p = new Packet20();
                p.interpretaP(packet,Repository.aliasInvio.get("alias").toString());

            case ("11"):
                Packet11 a = new Packet11();
                a.interpretaP(packet);

            case ("05"):
                Packet05 u = new Packet05();
                u.interpretaP(packet);
                
            case ("01"):
                Packet05 m = new Packet05();
                m.interpretaP(packet);
                
            case ("51"):
                Packet51 l = new Packet51();
                l.interpretaP(packet);
                
            case ("255"):
                Packet255 e = new Packet255();
                e.interpretaP(packet);
            
            
        }
    }
}
