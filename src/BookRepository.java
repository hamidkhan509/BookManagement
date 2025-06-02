import java.io.*;
import java.util.ArrayList;

public class BookRepository {
    private static final String FILE_NAME = "books.txt";

    public static void saveBook(Book book) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(book.getTitle() + "," + book.getAuthor() + "," + book.getPrice());
        } catch (IOException e) {
            System.out.println("Error saving book.");
        }
    }

    public static ArrayList<Book> getAllBooks() {
        ArrayList<Book> list = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return list;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    list.add(new Book(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading books.");
        }

        return list;
    }
}
