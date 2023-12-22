//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private Book[] books;
    private int numBooks;

    // Constructor
    public Library(int maxBooks) {
        books = new Book[maxBooks];
        numBooks = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Cannot add more books. Library is full.");
        }
    }

    // Method to remove a book from the library
    public void removeBook(String title) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("Book removed: " + books[i].getTitle() + " by " + books[i].getAuthor());
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numBooks - 1] = null;
                numBooks--;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }
}

public class pro11 {
    public static void main(String[] args) {
        // Creating a Library instance
        Library library = new Library(5); // Assuming maximum 5 books in the library

        // Adding books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Removing a book from the library
        library.removeBook("To Kill a Mockingbird");
    }
}
