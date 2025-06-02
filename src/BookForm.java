import javax.swing.*;

public class BookForm extends JFrame {
    JTextField titleField = new JTextField();
    JTextField authorField = new JTextField();
    JTextField priceField = new JTextField();
    JButton submitButton = new JButton("Submit");
    JButton viewAllButton = new JButton("View All");

    public BookForm() {
        setTitle("Add Book");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(30, 30, 100, 20);
        add(titleLabel);
        titleField.setBounds(100, 30, 150, 20);
        add(titleField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(30, 70, 100, 20);
        add(authorLabel);
        authorField.setBounds(100, 70, 150, 20);
        add(authorField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(30, 110, 100, 20);
        add(priceLabel);
        priceField.setBounds(100, 110, 150, 20);
        add(priceField);

        submitButton.setBounds(30, 160, 100, 25);
        submitButton.addActionListener(new AddBookSubmitButtonAction(this));
        add(submitButton);

        viewAllButton.setBounds(150, 160, 100, 25);
        viewAllButton.addActionListener(new ViewAllButtonAction(this));
        add(viewAllButton);

        setVisible(true);
    }
}

