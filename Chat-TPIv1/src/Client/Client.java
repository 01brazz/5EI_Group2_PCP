/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import pacchetti.Packet01;
import pacchetti.Packet05;
import pacchetti.Packet10;
import pacchetti.Packet11;
import pacchetti.Packet18;
import pacchetti.Packet50;

/**
 *
 * @author 5ei
 */
public class Client {

    public Client() {
    }

    public byte[] login(String Alias, String Topic) {

        Packet10 p = new Packet10(Alias, Topic);
        byte[] PacchettoLogin = p.createP();

        return PacchettoLogin;
    }

    public byte[] userToUser(byte[] id, String Alias, String Messagge) {

        Packet01 p = new Packet01(id, Alias, Messagge);
        byte[] PacchettoUserToUser = p.createP();

        return PacchettoUserToUser;
    }

    public byte[] userToChat(byte[] id, String Messagge) {

        Packet05 p = new Packet05(id, Messagge);
        byte[] PacchettoUserToChat = p.createP();

        return PacchettoUserToChat;
    }

    public byte[] disconnection(byte[] id) {

        Packet11 p = new Packet11(id);
        byte[] PacchettoDisconnection = p.createP();

        return PacchettoDisconnection;
    }

    public byte[] userListRequest(byte[] id) {

        Packet50 p = new Packet50(id);
        byte[] PacchettoUserListRequest = p.createP();

        return PacchettoUserListRequest;
    }

    public byte[] changeAlias(byte[] id, String old_Alias, String new_Alias) {

        Packet18 p = new Packet18(id, old_Alias, new_Alias);
        byte[] PacchettoChangeAlias = p.createP();

        return PacchettoChangeAlias;
    }
}
