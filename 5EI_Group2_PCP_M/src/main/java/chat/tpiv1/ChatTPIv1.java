/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.tpiv1;

import Client.Client;
import Client.Listener;
import java.io.*;
import java.net.*;
import java.util.*;
import repository.Repository;
import Graphics.*;

/**
 *
 * @author david
 */
public class ChatTPIv1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("127.0.0.1", 53101);

            DataOutputStream os = new DataOutputStream(socket.getOutputStream());

            Repository.os.put("os", os);
            Client client = new Client();

            Messaggistica.main(args);
            Login.main(args);

            Listener listener = new Listener(socket);
            listener.start();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
