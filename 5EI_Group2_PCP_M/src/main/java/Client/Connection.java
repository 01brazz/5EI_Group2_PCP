/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.*;
import java.net.*;
import pacchetti.Packet10;

/**
 *
 * @author david
 */
public class Connection {

    private Socket socket;
    private String ip;
    private int port;
    private DataOutputStream os;

    public Connection() {
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void connect() throws IOException {
        this.ip = "127.0.0.1";
        this.port = 53101;
        Socket socket = new Socket(ip, port);
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        this.os = os;
    }

    public void login(String Alias, String Topic) throws IOException {
        byte[] p = Packet10.createP(Alias, Topic);
        this.os.write(p);
    }
    
    public void send(byte[] packet) throws IOException {
        this.os.write(packet);
    }
}
