/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacchetti;

import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author 17701
 */
public class Packet255 {

    public String interpretaP(byte[] pacchetto) {

        String reason = new String();

        byte[] caso = new byte[1];

        System.arraycopy(pacchetto, 0, caso, 0, 1);
        String c = Arrays.toString(caso);
        switch (c) {
            case ("000"):
                reason = ("000 - malformed package");
            case ("100"):
                reason = ("100 - alias already in use");
            case ("101"):
                reason = ("101 - unvalid alias");
            case ("102"):
                reason = ("102 - invalid room name");
            case ("200"):
                reason = ("200 - chat denied");
            case ("202"):
                reason = ("202 - maximum clients reached");
            case ("254"):
                reason = ("254 - server exploded");
            case ("255"):
                reason = ("255 - unspecified exception");
        }
        return reason;
    }
}
