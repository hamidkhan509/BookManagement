import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BookListView extends JFrame {
    JTextArea displayArea = new JTextArea();
    JButton backButton = new JButton("Add Book");

    public BookListView() {
        setTitle("View All Books");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        displayArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(displayArea);
        scroll.setBounds(20, 20, 340, 280);
        add(scroll);

        ArrayList<Book> books = BookRepository.getAllBooks();
        StringBuilder sb = new StringBuilder();

        for (Book b : books) {
            sb.append("Title: ").append(b.getTitle()).append("\n");
            sb.append("Author: ").append(b.getAuthor()).append("\n");
            sb.append("Price: ").append(b.getPrice()).append(" BDT\n\n");
        }

        displayArea.setText(sb.toString());

        backButton.setBounds(140, 320, 100, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BookForm();
            }
        });
        add(backButton);

        setVisible(true);
    }
}

