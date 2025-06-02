import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ViewAllButtonAction implements ActionListener {
    BookForm form;

    public ViewAllButtonAction(BookForm form) {
        this.form = form;
    }

    public void actionPerformed(ActionEvent e) {
        form.dispose();
        new BookListView();
    }
}

