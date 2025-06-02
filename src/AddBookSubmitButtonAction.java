import javax.swing.*;
import java.awt.event.*;

public class AddBookSubmitButtonAction implements ActionListener {
    BookForm form;

    public AddBookSubmitButtonAction(BookForm form) {
        this.form = form;
    }

    public void actionPerformed(ActionEvent e) {
        String title = form.titleField.getText().trim();
        String author = form.authorField.getText().trim();
        String price = form.priceField.getText().trim();

        if (title.equals("") || author.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(form, "All fields are required.");
            return;
        }

        try {
            Double.parseDouble(price);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(form, "Price must be a number.");
            return;
        }

        Book book = new Book(title, author, price);
        BookRepository.saveBook(book);

        form.titleField.setText("");
        form.authorField.setText("");
        form.priceField.setText("");
    }
}
