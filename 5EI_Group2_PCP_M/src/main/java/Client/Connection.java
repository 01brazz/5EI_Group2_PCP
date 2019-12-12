/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.*;
import java.net.*;
import pacchetti.Packet10;
import pacchetti.Packet11;
import pacchetti.Packet20;

/**
 *
 * @author david
 */
public class Connection {

    private Socket socket;
    private InetAddress ip;
    private int port = 53101;
    private DataInputStream is;
    private BufferedOutputStream os;
    private String dest = null;

    public Connection(String addr) throws UnknownHostException {
        this.ip = InetAddress.getByName(addr);
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public InetAddress getIp() {
        return ip;
    }

    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public DataInputStream getIs() {
        return is;
    }

    public void setIs(DataInputStream is) {
        this.is = is;
    }

    public BufferedOutputStream getOs() {
        return os;
    }

    public void setOs(BufferedOutputStream os) {
        this.os = os;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void connect(String alias, String topic) throws IOException {
        this.socket = new Socket(ip, port);
        byte[] to_send = Packet10.createP(alias, topic);

        this.is = new DataInputStream(socket.getInputStream());
        this.os = new BufferedOutputStream(socket.getOutputStream());

        // invia la registrazione
        this.send(to_send);
    }

    public void send(byte[] packet) throws IOException {
        this.os.write(packet);
        this.os.flush();
    }
}
