/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.paint.Color;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Listener;

/**
 *
 * @author 18072
 */
public class GUI {

    public void GUI() {
        //------------------------------------
        // istanza finestra principale
        //------------------------------------
        Display display = new Display();
        Shell root = new Shell(display);
        root.setLayout(new FillLayout(SWT.VERTICAL));
        root.setLayout(new FillLayout(SWT.HORIZONTAL));

//        RowLayout rowLayout = new RowLayout();
//        rowLayout.wrap = true; //a capo
//        rowLayout.pack = false; //stessa lunghezza
//        rowLayout.justify = false; //allineamento ai bordi
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 4;
        gridLayout.makeColumnsEqualWidth = true;
        root.setLayout(gridLayout);

        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.horizontalSpan = 3;

        GridData gridData1 = new GridData();
        gridData1.horizontalAlignment = GridData.FILL;
        gridData1.horizontalSpan = 4;

        Label myLabel = new Label(root, SWT.NORMAL);
        myLabel.setText("CALCOLATRICE");
        myLabel.setLayoutData(gridData1);

        Text myField03 = new Text(root, SWT.BORDER);
        myField03.setLayoutData(root);

        Button buttonAdd = new Button(root, SWT.NORMAL);
        buttonAdd.setText("+");

        Button button7 = new Button(root, SWT.NORMAL);
        button7.setText("7");

        Button button8 = new Button(root, SWT.NORMAL);
        button8.setText("8");

        Button button9 = new Button(root, SWT.NORMAL);
        button9.setText("9");

        Button buttonSott = new Button(root, SWT.NORMAL);
        buttonSott.setText("-");

        Button button4 = new Button(root, SWT.NORMAL);
        button4.setText("4");

        Button button5 = new Button(root, SWT.NORMAL);
        button5.setText("5");

        Button button6 = new Button(root, SWT.NORMAL);
        button6.setText("6");

        Button buttonMolt = new Button(root, SWT.NORMAL);
        buttonMolt.setText("*");

        Button button1 = new Button(root, SWT.NORMAL);
        button1.setText("1");

        Button button2 = new Button(root, SWT.NORMAL);
        button2.setText("2");

        Button button3 = new Button(root, SWT.NORMAL);
        button3.setText("3");

        Button buttonDiv = new Button(root, SWT.NORMAL);
        buttonDiv.setText("/");

        Button buttonC = new Button(root, SWT.NORMAL);
        buttonC.setText("C");

        Button button0 = new Button(root, SWT.NORMAL);
        button0.setText("0");

        Button buttonPunto = new Button(root, SWT.NORMAL);
        buttonPunto.setText(".");

        Button buttonUguale = new Button(root, SWT.NORMAL);
        buttonUguale.setText("=");

        // Operazioni sulla finestra principale
        root.open();
        root.setSize(300, 400);

        button1.setSize(40, 40);
        button2.setSize(40, 40);
        button3.setSize(40, 40);

        //------------------------------------
        // repository view
        //------------------------------------
        Map<String, Object> repository_View = new HashMap<String, Object>() {
            {
                put("root", root);
                put("buttonAdd", buttonAdd);
                put("buttonSott", buttonSott);
                put("buttonMolt", buttonMolt);
                put("buttonDiv", buttonDiv);
                put("buttonC", buttonC);
                put("buttonUguale", buttonUguale);
                put("buttonPunto", buttonPunto);
                put("button0", button0);
                put("button1", button1);
                put("button2", button2);
                put("button3", button3);
                put("button4", button4);
                put("button5", button5);
                put("button6", button6);
                put("button7", button7);
                put("button8", button8);
                put("button9", button9);

                put("myField03", myField03);
            }
        };

        //------------------------------------
        // Istanza di una classe di elaborazione
        //------------------------------------
        Operazione operazioni_model = new Operazione();

        //------------------------------------
        // repository model
        //------------------------------------
        Map<String, Object> repository_Model = new HashMap<String, Object>() {
            {
                // costruttore della classe, non dell'istanza
                put("operazioni_model", operazioni_model);
            }
        };

        //------------------------------------
        // istanze oggetti  aventi interface Listener : Listener / CallBack
        //------------------------------------
        Listener button0_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "0");
            }
        };

        Listener button1_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "1");
            }
        };

        Listener button2_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "2");
            }
        };

        Listener button3_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "3");
            }
        };

        Listener button4_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "4");
            }
        };

        Listener button5_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "5");
            }
        };

        Listener button6_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "6");
            }
        };

        Listener button7_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "7");
            }
        };

        Listener button8_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "8");
            }
        };

        Listener button9_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + "9");
            }
        };

        Listener buttonPunto_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("" + myField03.getText() + ".");
            }
        };

        Listener buttonC_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                myField03.setText("");
            }
        };

        Listener buttonAdd_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Text myField01 = (Text) Repository.repository_View.get("myField03");
                String text1 = myField01.getText();
                myField03.setText("" + myField03.getText() + "+");
            }
        };

        Listener buttonSott_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Text myField01 = (Text) Repository.repository_View.get("myField03");
                String text1 = myField01.getText();
                myField03.setText("" + myField03.getText() + "-");
            }
        };

        Listener buttonMolt_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Text myField01 = (Text) Repository.repository_View.get("myField03");
                String text1 = myField01.getText();
                myField03.setText("" + myField03.getText() + "*");
            }
        };

        Listener buttonDiv_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Text myField01 = (Text) Repository.repository_View.get("myField03");
                String text1 = myField01.getText();
                myField03.setText("" + myField03.getText() + "/");
            }
        };

        Listener buttonUguale_listener = new Listener() {
            @Override
            public void handleEvent(Event e) {
                Text myField = (Text) Repository.repository_View.get("myField03");
                String text = myField.getText();

                Operazione op_model = (Operazione) Repository.repository_Model.get("operazioni_model");
                myField03.setText("" + op_model.operation(text));
            }
        };

        //------------------------------------
        // repository listener o callback
        //------------------------------------
        Map<String, Object> repository_Listener = new HashMap<String, Object>() {
            {
                // costruttore della classe, non dell'istanza
                put("buttonAdd_listener", buttonAdd_listener);
                put("buttonSott_listener", buttonSott_listener);
                put("buttonMolt_listener", buttonMolt_listener);
                put("buttonDiv_listener", buttonDiv_listener);
                put("button0_listener", button0_listener);
                put("button1_listener", button1_listener);
                put("button2_listener", button2_listener);
                put("button3_listener", button3_listener);
                put("button4_listener", button4_listener);
                put("button5_listener", button5_listener);
                put("button6_listener", button6_listener);
                put("button7_listener", button7_listener);
                put("button8_listener", button8_listener);
                put("button9_listener", button9_listener);
                put("buttonPunto_listener", buttonPunto_listener);
                put("buttonC_listener", buttonC_listener);
                put("buttonUguale_listener", buttonUguale_listener);
            }
        };

        //------------------------------------
        // inizializza il repository (ovvero l'App)
        //------------------------------------
        Repository.repository_View = repository_View;
        Repository.repository_Model = repository_Model;
        Repository.repository_Listener = repository_Listener;

        //------------------------------------
        // inizializza gli oggetti view che attivano i bottoni
        //------------------------------------
        button0.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button0_listener"));

        button1.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button1_listener"));

        button2.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button2_listener"));

        button3.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button3_listener"));

        button4.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button4_listener"));

        button5.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button5_listener"));

        button6.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button6_listener"));

        button7.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button7_listener"));

        button8.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button8_listener"));

        button9.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("button9_listener"));

        buttonPunto.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonPunto_listener"));

        buttonC.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonC_listener"));

        buttonAdd.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonAdd_listener"));

        buttonSott.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonSott_listener"));

        buttonMolt.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonMolt_listener"));

        buttonDiv.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonDiv_listener"));

        buttonUguale.addListener(SWT.MouseDown, (Listener) Repository.repository_Listener.get("buttonUguale_listener"));

        //------------------------------------
        // finche'  la finestra non viene chiusa _
        //        { se ci sono eventi leggi coda degli eventi => esegui
        //          altrimenti in attesa }
        //-------------------------------------          
        while (!root.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Istanza senza variabile
        new GUI().GUI();

    }
}
