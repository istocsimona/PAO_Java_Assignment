package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreTest {
    private List<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void createBook(){
        System.out.print("Introduceti titlul: ");
        String title = sc.nextLine();

        System.out.print("Introduceti autorul: ");
        String author = sc.nextLine();

        System.out.print("Introduceti editura: ");
        String publisher = sc.nextLine();

        System.out.print("Introduceti numarul de pagini: ");
        int pageCount = sc.nextInt();

        sc.nextLine();

        try{
            Book book = new Book(title, author, publisher, pageCount);
            books.add(book);
            System.out.println("Carte adaugata cu succes");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void readBooks(){
        for(Book book: books){
            book.printInfo();
            System.out.println("===========");
        }
    }

    public void updateBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                System.out.print("Introduceti noul titlu: ");
                book.setTitle(sc.nextLine());
                System.out.print("Introduceti noul autor: ");
                book.setAuthor(sc.nextLine());
                System.out.print("Introduceti noua editura: ");
                book.setPublisher(sc.nextLine());
                System.out.print("Introduceti noul numar de pagini: ");
                book.setPageCount(sc.nextInt());
                sc.nextLine();
                System.out.println("Carte actualizată cu succes!");
                return;
            }
        }
        System.out.println("Carte inexistenta");
    }

    public void deleteBook(String title){
        books.removeIf(book -> book.getTitle().equals(title));
        System.out.println("Carte stearsa");
    }

    public List<Book> getBooks(){
        return books;
    }
}
