/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

import java.net.*;
import java.io.*;
/**
 *
 * @author Andrea
 */
public class Packet01 {
    private byte[]  id;
    private String Alias;
    private String Message;

    public Packet01(byte[] id, String Alias, String Message) {
        this.id = id;
        this.Alias = Alias;
        this.Message = Message;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
    
    //metodo per creare pacchetto
    public byte[] createP(){
        byte[] UserToUser =new byte[2048];
        
        int i =0;
        UserToUser[i++]=01;
        
        for (byte b: this.id){
            UserToUser[i++]=b;
        }
        
        for (byte b: this.Alias.getBytes()){
            UserToUser[i++]=b;
        }
        
        UserToUser[i++]=0;
        
        for (byte b: this.Message.getBytes()){
            UserToUser[i++]=b;
        }
        
        UserToUser[i++]=0;
        
        return UserToUser;
    }
   
    
    
    
        
    
    
    
}
