package Praxis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraxisGui {
    Patient erster;
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

    public PraxisGui() {

        schlange = new Queue<Patient>() {
        };
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

                namenfeld.setText("");
                nachnamenfeld.setText("");


            }
        });
    }




}






















