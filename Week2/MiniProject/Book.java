package Week2.MiniProject;

public class Book {
    private final String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean borrow() {
        if (borrowed) {
            return false;
        }
        borrowed = true;
        return true;
    }

    public boolean returnBook() {
        if (!borrowed) {
            return false;
        }
        borrowed = false;
        return true;
    }
}