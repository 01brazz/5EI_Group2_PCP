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
import java.util.Base64;

/**
 *
 * @author Degio & Bruse
 */
public class Packet51 {

    private String Type;
    private String List_Length;
    private String json_content;

    public Packet51(String Type,
            String List_Lenght, String json_content) {
        this.Type = Type;
        this.List_Length = List_Lenght;
        this.json_content = json_content;

    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getList_Length() {
        return List_Length;
    }

    public void setList_Length(String List_Length) {
        this.List_Length = List_Length;
    }

    public String getJson_content() {
        return json_content;
    }

    public void setJson_content(String json_content) {
        this.json_content = json_content;
    }

    public ArrayList interpretaP(byte[] pacchetto) {

        byte tipo = pacchetto[1];
        byte list_length = pacchetto[2];
        byte[] List = Arrays.copyOfRange(pacchetto, 3, pacchetto.length - 1);

        Gson gson = new Gson();
        String User = Base64.getEncoder().encodeToString(List);

        ArrayList list = gson.fromJson(User, ArrayList.class);

        return list;
    }
}
