import java.util.*;

class Book {
    Scanner in = new Scanner(System.in);
    String name, author;
    int price, num_pages;

    Book(String n, String a, int p, int np) {
        name = n;
        author = a;
        price = p;
        num_pages = np;
    }

    void setDetails() {
        System.out.println("Enter Book Name: ");
        name = in.nextLine();  // Changed to nextLine() to capture full name
        System.out.println("Enter Author Name: ");
        author = in.nextLine();  // Changed to nextLine() to capture full author name
        System.out.println("Price of the Book: ");
        price = in.nextInt();
        System.out.println("No of pages: ");
        num_pages = in.nextInt();
        in.nextLine();     }

    void getDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author Name: " + author);
        System.out.println("Book price: " + price);
        System.out.println("No of pages: " + num_pages);
    }

    public String toString() {
        return "Book Name: " + name + "\nAuthor Name: " + author + "\nBook price: " + price + "\nNo of pages: " + num_pages;
    }
}

public class Lab_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of books:");
        int noBook = in.nextInt();
        in.nextLine(); // Clear the newline character

        Book[] bk = new Book[noBook];
        for (int i = 0; i < noBook; i++) {
            System.out.println("Book: " + (i + 1));
            bk[i] = new Book("", "", 0, 0); 
            bk[i].setDetails();
        }

        System.out.println("\nBook Details:");
        for (int k = 0; k < noBook; k++) {
            System.out.println();
            bk[k].getDetails();
            System.out.println(bk[k].toString());
        }
	System.out.println("B VATSAL");
	System.out.println("1BM23CS061");
       
    }
}