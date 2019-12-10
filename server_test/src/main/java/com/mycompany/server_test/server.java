/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.server_test;

import PCP.services.PCPServer;
import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 5ei
 */
public class server {

    public static void main(String[] args) throws IOException {
        // changes default console logging level
Logger.getLogger("").getHandlers()[0].setLevel(Level.FINEST);
// changes global configuration logging level
Logger.getGlobal().setLevel(Level.FINEST);
        
        InetAddress address = InetAddress.getByName("172.16.7.156");
        PCPServer server = new PCPServer(address);
        server.acceptAndServe();
    }
}
