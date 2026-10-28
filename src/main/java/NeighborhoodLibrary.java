import java.util.Scanner;

public class NeighborhoodLibrary {
   public static Book[] book = new Book[20];

   public static int numOfBooksCheckedOut= 20;


    public static Scanner myScanner= new Scanner(System.in);

    public static boolean exit = true;




    public static void main(String[] args) {



        book[0]= new Book(1,"978-0-123456-47-2","The silent forest", false , " is checked out" );
        book[1]= new Book(2,"978-0-123456-47-3","To Kill a Mockingbird", false , " is checked out" );
        book[2]= new Book(3,"978-0-123456-47-4","1984", false , " is checked out" );
        book[3]= new Book(4,"978-0-123456-47-5","Pride and Prejudice", false , " is checked out" );
        book[4]= new Book(5,"978-0-123456-47-6","The Great Gatsby", false , " is checked out" );
        book[5]= new Book(6,"978-0-123456-47-7","Moby-Dick", false , " is checked out" );
        book[6]= new Book(7,"978-0-123456-47-8","War and Peace", false , " is checked out" );
        book[7]= new Book(8,"978-0-123456-47-9","The Catcher in the Rye", false , " is checked out" );
        book[8]= new Book(9,"978-0-123456-47-10","Jane Eyre", true , " is checked out" );
        book[9]= new Book(10,"978-0-123456-47-11","Brave New World", true , " is checked out" );
        book[10]= new Book(11,"978-0-123456-47-12","The Hobbit", true , " is checked out" );
        book[11]= new Book(12,"978-0-123456-47-13","Crime and Punishment", true , " is checked out" );
        book[12]= new Book(13,"978-0-123456-47-14","The Lord of the Rings", true , " is checked out" );
        book[13]= new Book(14,"978-0-123456-47-15","Little Women", true , " is checked out" );
        book[14]= new Book(15,"978-0-123456-47-16","The Brothers Karamazov", true , " is checked out" );
        book[15]= new Book(16,"978-0-123456-47-17","Great Expectations", true , " is checked out" );
        book[16]= new Book(17,"978-0-123456-47-18","Animal Farm", true , " is checked out" );
        book[17]= new Book(18,"978-0-123456-47-19","Wuthering Heights", true , " is checked out" );
        book[18]= new Book(19,"978-0-123456-47-20","The Odyssey", true , " is checked out" );
        book[19]= new Book(20,"978-0-123456-47-21","Harry Potter and the Sorcerer’s Stone", true , " is checked out" );


        while (exit) {
            System.out.println(" 1 Show available books");
            System.out.println(" 2 Show Checked Out Books ");
            System.out.println(" 3 if you want to exit ");

            int menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu){
                case 1 -> showAvailableBooks();
                case 2 -> Book.showCheckedOutBooks();
                case 3 -> exit= false;
            }

        }
    } public static void showAvailableBooks () {
        for (int i = 0; i < numOfBooksCheckedOut; i++) {
            if (!book[i].isCheckedOut()) {
                System.out.println(book[i]);
            }


        }
    }

}
