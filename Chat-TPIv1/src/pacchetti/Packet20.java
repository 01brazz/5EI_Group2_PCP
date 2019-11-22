/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

import java.util.*;


/**
 *
 * @author 17726
 */
public class Packet20 {
    private byte[] pacchetto;
    private String alias;

    public Packet20(byte[] pacchetto, String alias) {
        this.pacchetto = pacchetto;
        this.alias = alias;
    }

    public byte[] getPacchetto() {
        return pacchetto;
    }

    public void setPacchetto(byte[] pacchetto) {
        this.pacchetto = pacchetto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
<<<<<<< HEAD
    public byte[] interpretaP(){
    
    int i = 0;
    byte[] AliasC = new byte[2048];
    AliasC[i++] = 0;
    for (byte b : AliasC){
        while (i<=2){
            AliasC.remove(b);
            i += 1;
        }
        AliasC[i++] = b;
    }
    AliasC.remove(AliasC.lenght()-1);
    return AliasC;
    }
    public void confrontaAlias(byte[] AliasC){
        if (AliasC.getString() == this.alias){
            System.out.println("stonks");
        }else {
            System.out.println("not stonks");
=======
    public byte[] interpretaP {
        byte[] aliasC = new byte[100];
        for (byte b : this.pacchetto){
            //metti in aliasC tutto tranne i primi 3 byte e l'ultimo
>>>>>>> b58dcb0b50eba34da3cb6a246199b05cd3b7bc80
        }
    }
}