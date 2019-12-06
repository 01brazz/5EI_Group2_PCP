/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Graphics.*;
import java.awt.Component;
import java.io.*;
import java.util.*;
import javax.swing.JList;
import javax.swing.JPanel;
import repository.Repository;
import pacchetti.*;

/**
 *
 * @author 5ei
 */
public class Interpreter extends Thread {

    private byte[] packet;
    private Messaggistica mex;

    public Interpreter(byte[] packet, Messaggistica mex) {
        this.packet = packet;
        this.mex = mex;
    }

    @Override
    public void run() {

        Byte opcode= packet[0];
        
        String op = Byte.toString(opcode);
        System.out.println(op);
        switch (op) {
            case ("20"):
                System.out.println("dio");
                Packet20.interpretaP(packet, Login.alias);

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
                ArrayList lista = l.interpretaP(packet);
                JList jList1 = this.mex.getjList1();
                int pos = 0;
                for (Object alias : lista) {
                    jList1.add((Component) alias, pos++);
                }

            case ("255"):
                Packet255 e = new Packet255();
                e.interpretaP(packet);
        }
    }
}
