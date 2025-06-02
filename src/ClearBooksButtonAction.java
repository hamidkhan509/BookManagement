import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClearBooksButtonAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FileWriter writer = new FileWriter("books.txt");
            writer.write("");
            writer.close();
            JOptionPane.showMessageDialog(null, "All books cleared.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error clearing books.");
        }
    }
}

