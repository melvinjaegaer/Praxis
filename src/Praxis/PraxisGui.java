package Praxis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraxisGui {
    Patient erster;
    Stack<Patient>  rechnung;
    Queue<Patient> schlange;
    Queue<Patient> schlangeA;

    private JPanel Artzpraxis;
    private JTextField namenfeld;
    private JTextField nachnamenfeld;
    private JButton aufnehmen;
    private JTextField Nächsterfeld;
    private JButton aufrufen;
    private JLabel nachname;
    private JLabel name;
    private JLabel praxis;
    private JCheckBox blutbox;
    private JCheckBox artztbox;
    private JTextField blutT;
    private JLabel blutL;
    private JTextField textR;
    private JLabel stapelL;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JButton buttonR;

    public PraxisGui() {

        schlange = new Queue<Patient>() {
        };
        rechnung =new Stack<Patient>(){};
        aufnehmen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erster = new Patient(namenfeld.getText(), nachnamenfeld.getText());

               if(blutbox.isSelected()){
                   schlange.enqueue(Patient);
               }
               if(artztbox.isSelected()){
                   schlangeA.enqueue(Patient);
               }


                schlange.enqueue(erster);
                namenfeld.setText("");
                nachnamenfeld.setText("");


            }
        });


        aufrufen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textR.setText();

                namenfeld.setText("");
                nachnamenfeld.setText("");


                rechnung.push(Patient);
                rechnung.top(Patient);



            }


        });
        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechnung.pop(Patient);
            }
        });
    }




}






















