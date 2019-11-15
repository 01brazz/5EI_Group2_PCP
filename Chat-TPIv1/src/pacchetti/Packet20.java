/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

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
    
    public byte[] interpretaP {
        byte[] aliasC = new byte[100];
        for (byte b : this.pacchetto){
            //metti in aliasC tutto ranne i primi 3 byte e l'ultimo
        }
    }
}
