package Tema;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookstoreTest bookstore = new BookstoreTest();
        bookstore.createBook();
        bookstore.createBook();

        bookstore.readBooks();
        List<Book> books = bookstore.getBooks();

        if(BookstoreCheck.isDuplicate(books.get(0), books.get(1))){
            System.out.println("Carti duplicate");
        }
        else{
            System.out.println(("Cartile sunt diferite"));
        }

        Book thikerBook = BookstoreCheck.thickerBook(books.get(0), books.get(1));
        System.out.println("Cartea mai groasa este: "+thikerBook.getTitle());

        System.out.println("Cartea cu index O stearsa-----");
        bookstore.deleteBook(books.get(0).getTitle());
        bookstore.readBooks();
    }
}
