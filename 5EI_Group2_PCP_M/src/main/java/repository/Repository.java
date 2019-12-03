/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.Map;

/**
 *
 * @author 5ei
 */
public class Repository {

    //qui teniamo i parametri utili come login ecc
    static public Map<String, Object> credentials = null;
    //qui vengono tenuti gli ultimi messaggi arrivati che verranno displayati nell'interfaccia
    static public Map<String, Object> messages = null;
    //in questo dizionario va messo un diz con chiave l'alias dell'utente quando lo si seleziona nell'elenco
    //quando si clicca il bottone invio il metodo prende l'alias, crea il pacchetto 01 col testo preso
    //nel textbox e lo invia
    static public Map<String, Object> aliasInvio = null;
}
