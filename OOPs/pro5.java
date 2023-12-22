//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class BookCollection {
    private static final int MAX_BOOKS = 100; // Maximum number of books in the collection
    private Book[] books;
    private int numBooks;

    // Constructor
    public BookCollection() {
        books = new Book[MAX_BOOKS];
        numBooks = 0;
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Cannot add more books. Collection is full.");
        }
    }

    // Method to remove a book from the collection
    public void removeBook(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.println("Book removed: " + books[i].getTitle());
                // Shift books to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numBooks - 1] = null;
                numBooks--;
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}

public class pro5 {
    public static void main(String[] args) {
        // Creating a BookCollection
        BookCollection myBooks = new BookCollection();

        // Adding books
        myBooks.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488"));
        myBooks.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        myBooks.addBook(new Book("1984", "George Orwell", "9780451524935"));

        // Removing a book
        myBooks.removeBook("9780061120084");
    }
}
