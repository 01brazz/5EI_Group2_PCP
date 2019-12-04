/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import pacchetti.*;
import chat.tpiv1.ChatTPIv1;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author 5ei
 */
public class Client {

    private DataOutputStream os;

    public Client(DataOutputStream socket) {
        this.os = socket;
    }

    public DataOutputStream getOs() {
        return os;
    }

    public void setOs(DataOutputStream os) {
        this.os = os;
    }

    public static byte[] login(String Alias, String Topic) {
        Packet10 p = new Packet10(Alias, Topic);
        byte[] PacchettoByte = p.createP();

        return PacchettoByte;
    }

    public static byte[] userToUser(byte[] id, String Alias, String Messagge) {
        Packet01 p = new Packet01(id, Alias, Messagge);
        byte[] PacchettoLogin = p.createP();

        return PacchettoLogin;
    }

    public static byte[] userToChat(byte[] id, String Messagge) {
        Packet05 p = new Packet05(id, Messagge);
        byte[] PacchettoUserToChat = p.createP();

        return PacchettoUserToChat;
    }

    public static byte[] disconnection(byte[] id) {
        Packet11 p = new Packet11(id);
        byte[] PacchettoDisconnection = p.createP();

        return PacchettoDisconnection;
    }

    public static byte[] userListRequest(byte[] id) {
        Packet50 p = new Packet50(id);
        byte[] PacchettoUserListRequest = p.createP();

        return PacchettoUserListRequest;
    }

    public static byte[] changeAlias(byte[] id, String old_Alias, String new_Alias) {
        Packet18 p = new Packet18(id, old_Alias, new_Alias);
        byte[] PacchettoChangeAlias = p.createP();

        return PacchettoChangeAlias;
    }

    public void send(byte[] packet) throws IOException {
        DataOutputStream os = this.getOs();
    }
}
