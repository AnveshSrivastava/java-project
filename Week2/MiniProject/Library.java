package Week2.MiniProject;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(Book book) {
        return books.contains(book) && book.borrow();
    }

    public boolean returnBook(Book book) {
        return books.contains(book) && book.returnBook();
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Phus Ki Raat");
        Member member = new Member("Ram");

        library.addBook(book);
        System.out.println("Book borrowed: " + library.borrowBook(book));
        System.out.println("Book returned: " + library.returnBook(book));
        member.displayRole();
    }
}