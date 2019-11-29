/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.tpiv1;

import Client.Client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Repository;

/**
 *
 * @author david
 */
public class ChatTPIv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 53101);
        System.out.println("Client connesso");

        DataOutputStream os = new DataOutputStream(socket.getOutputStream());

        Client client = new Client();

        Scanner sc = new Scanner(System.in);

        System.out.println("Iserisci alias");
        String alias = sc.nextLine();
        System.out.println("Iserisci topic");
        String topic = sc.nextLine();

        Map<String, Object> credentials = new HashMap<String, Object>() {
            {
                // costruttore della classe, non dell'istanza
                put("alias", alias);
                put("topic", topic);
            }
        };

        byte[] login = client.login(alias, topic);

        os.write(login);

        System.out.println("Utente connesso!");

    }
}
