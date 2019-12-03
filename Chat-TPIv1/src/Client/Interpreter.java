/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Repository;
import pacchetti.Packet20;
import pacchetti.Packet11;
import pacchetti.Packet05;

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

        switch (opcode) {
            case (20):
                Packet20 p = new Packet20(packet, (String) Repository.credentials.get("alias"));
                p.interpretaP(packet);

            case (11):
                Packet11 a = new Packet11(packet);
                a.interpretaP(packet);

            case (05):
                Packet05 u = new Packet05(packet, "");
                u.interpretaP(packet);
        }
    }
}
