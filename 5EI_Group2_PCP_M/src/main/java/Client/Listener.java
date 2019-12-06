/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Graphics.Messaggistica;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import Client.Connection;

/**
 *
 * @author 5ei
 */
public class Listener extends Thread {

    private Connection connection;
    private Messaggistica mex;

    public Listener(Connection connection, Messaggistica mex) {
        this.connection = connection;
        this.mex = mex;
    }

    @Override
    public void run() {

        try {

            while (true) {
                byte[] b = new byte[2048];
                connection.getIs().read(b);
                Interpreter i = new Interpreter(b, mex);
                System.out.println("thread creato");
                i.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
