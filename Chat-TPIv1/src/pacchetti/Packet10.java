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
 * @author Degio & Bruse
 */
public class Packet10
{

    private String Alias;
    private String Topic;

    public Packet10(String Alias,
                    String Topic)
    {
        this.Alias = Alias;
        this.Topic = Topic;
    }

    public String getAlias()
    {
        return Alias;
    }

    public String getTopic()
    {
        return Topic;
    }

    public void setAlias(String Alias)
    {
        this.Alias = Alias;
    }

    public void setTopic(String Topic)
    {
        this.Topic = Topic;
    }

    public byte[] createP()
    {
        byte[] packet = new byte[2048];
        int i = 0;
        packet[i++] = 10;
        packet[i++] = 0;
        for (byte b : this.Alias.getBytes())
        {
            packet[i++] = b;
        }

        for (byte b : this.Topic.getBytes())
        {
            packet[i++] = b;
        }

        return packet;
    }

}
