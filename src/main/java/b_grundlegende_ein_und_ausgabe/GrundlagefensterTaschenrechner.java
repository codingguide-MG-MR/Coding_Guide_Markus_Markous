
package b_grundlegende_ein_und_ausgabe;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrundlagefensterTaschenrechner {
    public static void main(String[] args) {
        // Erstellen des JFrame-Fensters
        JFrame frame = new JFrame("Swing Beispiel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Verwenden eines null Layouts

        // Erstellen eines Buttons
        JButton button = new JButton("Klicken Sie mich!");
        button.setBounds(100, 100, 200, 40); // Setzen der Position und Größe des Buttons

        // Erstellen eines Labels
        JLabel label = new JLabel("Willkommen bei Swing!");
        label.setBounds(100, 50, 200, 40); // Setzen der Position und Größe des Labels

        // Hinzufügen einer Aktion zum Button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button wurde geklickt!");
            }
        });

        // Hinzufügen der Komponenten zum Frame
        frame.add(button);
        frame.add(label);

        // Frame sichtbar machen
        frame.setVisible(true);
    }
}
