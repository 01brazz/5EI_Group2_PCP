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
import repository.Repository;

/**
 *
 * @author Degio & Bruse
 */
public class Packet51 {

    public static ArrayList interpretaP(byte[] pacchetto) {

        byte tipo = pacchetto[1];
        byte list_length = pacchetto[2];
        int guardia = 0;
        int finelista = 0;
        for(byte b : pacchetto){
            if(!(guardia == 2)){
                
            
                if (b==0){
                    guardia++;
                    finelista++;
                }else
                {
                    finelista++;
                    
                }
            }else{
                break;
            }
        }
        
        byte[] List = Arrays.copyOfRange(pacchetto, 3, finelista-1  );
        System.out.println(Arrays.toString(List));
        String user = new String(List);

        Gson gson = new Gson();
        
        System.out.println(user);
        ArrayList list = gson.fromJson(user, ArrayList.class);
        
        return list;
    }
}
