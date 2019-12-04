/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 5ei
 */
public class Listener extends Thread {

    private Socket socket;

    public Listener(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            DataInputStream is = new DataInputStream(socket.getInputStream());
            while (true) {
                byte[] b = new byte[2048];
                int byteletti = is.read(b);
                b = Arrays.copyOfRange(b, 0, byteletti);
                Interpreter i = new Interpreter(b);
            }

        } catch (IOException ex) {
            Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
