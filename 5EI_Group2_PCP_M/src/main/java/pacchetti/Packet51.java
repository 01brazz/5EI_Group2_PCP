/*
 * Durante la connessione a un gruppo, invece di perdere tempo a inviare l'alias utente per ogni messaggio, il server assegnerà un ID intero a 16 bit a ogni client. 
 * Per consentire la risoluzione dei nomi per i client, viene inviato l'elenco utenti del gruppo.
 * Se la lunghezza del messaggio è maggiore di 2024 significa che il messaggio è stato suddiviso tra più pacchetti. 
 * L'ultimo pacchetto viene notificato con una lunghezza inferiore al 2024. 
 * Se il contenuto risulta in un multiplo di questo numero, verrà inviato un pacchetto vuoto per notificare la fine della trasmissione.
 * I nomi vengono inviati in un elenco JSON. Come nell'esempio seguente:
 *
 * tipi:
 *
 * 0 elenco utenti completo
 * 1 utente iscritto
 * 2 utenti disconnessi
 * [ "Alias1", "alias2", "alias3"]
 * Nel caso in cui il tipo sia 1 o 2, l'elenco json conterrà solo un utente, quello che si è connesso o disconnesso.
 */
package pacchetti;

import java.util.ArrayList;
import java.util.Arrays;
import com.google.gson.*;
import Graphics.Messaggistica;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author Degio & Bruse
 */
public class Packet51 {

    public static ArrayList interpretaP(byte[] pacchetto, Messaggistica mex) {

        byte tipo = pacchetto[1];
        byte list_length = pacchetto[2];
        int guardia = 0;
        int finelista = 0;
        String type = Byte.toString(tipo);
        ArrayList list = new ArrayList();

        switch (type) {
            case ("0"):
                for (byte b : pacchetto) {
                    if (!(guardia == 2)) {
                        if (b == 0) {
                            guardia++;
                            finelista++;
                        } else {
                            finelista++;
                        }
                    } else {
                        break;
                    }
                }
                byte[] List = Arrays.copyOfRange(pacchetto, 3, finelista - 1);
                System.out.println(Arrays.toString(List));
                String user = new String(List);
                Gson gson = new Gson();
                System.out.println(user);
                list = gson.fromJson(user, ArrayList.class);
                JComboBox jComboBox = mex.getjComboBox2();
                jComboBox.removeAllItems();
                for (Object alias : list) {
                    jComboBox.addItem(alias);
                }
                break;

            case ("1"):
                for (byte b : pacchetto) {
                    if (b == 0) {
                        break;
                    } else {
                        finelista++;
                    }
                }
                byte[] List1 = Arrays.copyOfRange(pacchetto, 3, finelista - 1);
                System.out.println(Arrays.toString(List1));
                String user1 = new String(List1);
                Gson gson1 = new Gson();
                System.out.println(user1);
                list = gson1.fromJson(user1, ArrayList.class);
                JComboBox jComboBox1 = mex.getjComboBox2();
                for (Object alias : list) {
                    jComboBox1.addItem(alias);
                }
                break;

            case ("2"):
                for (byte b : pacchetto) {
                    if (b == 0) {
                        break;
                    } else {
                        finelista++;
                    }
                }
                byte[] List2 = Arrays.copyOfRange(pacchetto, 3, finelista - 1);
                System.out.println(Arrays.toString(List2));
                String user2 = new String(List2);
                Gson gson2 = new Gson();
                System.out.println(user2);
                list = gson2.fromJson(user2, ArrayList.class);
                JComboBox jComboBox2 = mex.getjComboBox2();
                for (Object alias : list) {
                    jComboBox2.removeItem(alias);
                }
                break;
        }
        return list;
    }
}
