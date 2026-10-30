import java.util.Scanner;

public class NeighborhoodLibrary {
    public static Book[] book = new Book[20];

    public static Scanner myScanner = new Scanner(System.in);

    public static boolean exit = true;

    public static void main(String[] args) {

        book[0] = new Book(1, "978-0-123456-47-2", "The silent forest", true, "Raymound");
        book[1] = new Book(2, "978-0-123456-47-3", "To Kill a Mockingbird", true, "Fabricio");
        book[2] = new Book(3, "978-0-123456-47-4", "1984", true, "jennifer");
        book[3] = new Book(4, "978-0-123456-47-5", "Pride and Prejudice", false, "");
        book[4] = new Book(5, "978-0-123456-47-6", "The Great Gatsby", false, "");
        book[5] = new Book(6, "978-0-123456-47-7", "Moby-Dick", false, "");
        book[6] = new Book(7, "978-0-123456-47-8", "War and Peace", false, "");
        book[7] = new Book(8, "978-0-123456-47-9", "The Catcher in the Rye", false, "");
        book[8] = new Book(9, "978-0-123456-47-10", "Jane Eyre", true, "Autum");
        book[9] = new Book(10, "978-0-123456-47-11", "Brave New World", true, "Mark");
        book[10] = new Book(11, "978-0-123456-47-12", "The Hobbit", true, "kaleab");
        book[11] = new Book(12, "978-0-123456-47-13", "Crime and Punishment", true, "Brandon");
        book[12] = new Book(13, "978-0-123456-47-14", "The Lord of the Rings", true, "Jeda");
        book[13] = new Book(14, "978-0-123456-47-15", "Little Women", true, "Latel");
        book[14] = new Book(15, "978-0-123456-47-16", "The Brothers Karamazov", true, "Amanda");
        book[15] = new Book(16, "978-0-123456-47-17", "Great Expectations", true, "Isaiah");
        book[16] = new Book(17, "978-0-123456-47-18", "Animal Farm", true, "Jamson");
        book[17] = new Book(18, "978-0-123456-47-19", "Wuthering Heights", true, "Andeila");
        book[18] = new Book(19, "978-0-123456-47-20", "The Odyssey", true, "Adrian");
        book[19] = new Book(20, "978-0-123456-47-21", "Harry Potter and the Sorcerer’s Stone", true, "Marcus");

        while (exit) {
            System.out.println("1 Show available books");
            System.out.println("2 Show checked out books");
            System.out.println("3 Exit");

            int menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu) {
                case 1 -> showAvailableBooks();
                case 2 -> showCheckedOutBooks();
                case 3 -> exit = false;
            }
        }
    }

    public static void showAvailableBooks() {
        System.out.println("These are the available books:");
        for (Book b : book) {
            if (b != null && !b.isCheckedOut()) {
                System.out.println(b.getId() + " | " + b.getIsbn() + " | " + b.getTitle());
            }
        }

        System.out.println("Enter the Id of the book you want to check out or x if you want to go back");

        int choice = myScanner.nextInt();
        myScanner.nextLine();
        String x = myScanner.nextLine();

        if (x.equalsIgnoreCase("x")) {
            return;
        }

        for (Book b : book) {
            if (b != null && b.getId() == choice) {
                if (!b.isCheckedOut()) {
                    System.out.println("Enter your name:");
                    String name = myScanner.nextLine();
                    b.checkOut(name);
                    System.out.println("Book check out approved.");
                } else {
                    System.out.println("Book is already checked out.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void showCheckedOutBooks() {
        System.out.println("These are the checked out books:");
        for (Book b : book) {
            if (b != null && b.isCheckedOut()) {
                System.out.println(b.getId() + " | " + b.getIsbn() + " | " + b.getTitle()
                        + " | Checked out to: " + b.getCheckedOutTo());
            }
        }

        System.out.println("Enter C to check in a book");

        String choice = myScanner.nextLine();

        if (choice.equalsIgnoreCase("C")) {
            checkInBook();
        }
    }

    public static void checkInBook() {
        System.out.println("Enter the Id of the book you want to check in:");
        int id = myScanner.nextInt();
        myScanner.nextLine();

        for (Book b : book) {
            if (b != null && b.getId() == id) {
                if (b.isCheckedOut()) {
                    b.checkIn();
                    System.out.println("Book checked in successfully.");
                } else {
                    System.out.println("That book is still available.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
