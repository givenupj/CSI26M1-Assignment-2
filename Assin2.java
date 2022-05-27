package java.assignment2;

public class Assin2 {import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
    public class Assin2<Computers> extends JFrame {
        private JPanel contentPane;
        private JTextField textIP;
        private JTextField textValue;

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Assin2 frame = new Assin2();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        ArrayList<Computers> computerlist;
        String header[] = new String[] {"IP","Value"};
}
