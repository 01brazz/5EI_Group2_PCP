/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import pacchetti.Packet10;

/**
 *
 * @author 5ei
 */
public class Client {

    public Client() {
    }
    
    public byte[] login( String Alias,String Topic){
        
        Packet10 p = new Packet10(Alias,Topic);
        byte[] PacchettoByte = p.createP();
    
        return PacchettoByte;
    };
    
    
}
