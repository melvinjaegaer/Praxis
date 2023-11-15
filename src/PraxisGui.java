import javax.swing.*;

public class PraxisGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PraxisGui");
        frame.setContentPane(new PraxisGui().Artzpraxis);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Artzpraxis;
}
