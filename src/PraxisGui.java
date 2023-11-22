import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraxisGui {
   patient=erster;
    private JPanel Artzpraxis;
    private JTextField namenfeld;
    private JTextField nachnamenfeld;
    private JButton aufnehmen;
    private JTextField Nächsterfeld;
    private JButton aufrufen;
    private JLabel nachname;
    private JLabel name;
    private JLabel praxis;

    public PraxisGui() {
        aufnehmen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aufnehmen();
                namenfeld.setText("");
              nachnamenfeld.setText("");
                Nächsterfeld.setText(erster.getNachname() + erster.getVorname());
            }
        });



        aufrufen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aufrufen();
                namenfeld.setText("");
               nachnamenfeld.setText("");

                if(erster!=null) {

                 Nächsterfeld.setText(erster.getNachname()+", "+ erster.getVorname());
                }else{

                    Nächsterfeld.setText("");

            }
        });
    });



    public void aufnehmen(){
        patient pPatient=new patient(namenfeld.getText(), nachnamenfeld.getText());
        if(erster==null){
            erster=pPatient;

        } else{
            erster.setNachfolger(pPatient);

        }
        if(erster!=null) {
            Nächsterfeld.setText(erster.getNachname()  +", "+ erster.getVorname());
        }else{
            Nächsterfeld.setText("");
        }
    }
    public patient aufrufen(){
        if(erster!=null) {
            patient zwischenspeicher = erster;
            erster = erster.getNachfolger();
            return zwischenspeicher;
        }else{return null;}
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PraxisGui");
        frame.setContentPane(new PraxisGui().Artzpraxis);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

    public static class patient {

      String vorname = "";
      String nachname = "";
      String krankenkasse = "";
      patient nachfolger;

      patient(String pvorname, String pnachname) {

          vorname = pvorname;
          nachname = pnachname;



      }

      public patient getNachfolger() {
          return nachfolger;
      }

      public String getVorname() {
          return vorname;
      }

      public String getNachname() {
          return nachname;
      }

      public String getKrankenkasse() {
          return krankenkasse;
      }

      public void setKrankenkasse(String pKrankenkasse) {
          krankenkasse = pKrankenkasse;
      }

      public void setVorname(String pVorname) {
          vorname = pVorname;
      }

      public void setNachname(String pNachname) {
          nachname = pNachname;
      }

      public void setNachfolger( patient pNachfolger) {
          if(nachfolger==null){
              nachfolger = pNachfolger;}
          else{


              nachfolger.setNachfolger(pNachfolger);
          }

      }





















  }
