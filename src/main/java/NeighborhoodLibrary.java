import java.util.Scanner;

public class NeighborhoodLibrary {
   public static Books[] book = new Books[20];

   public static int numOfBooksCheckedOut= 20;


    public static Scanner myScanner= new Scanner(System.in);

    public static boolean id = true;




    public static void main(String[] args) {



        book[0]= new Books (1,"978-0-123456-47-2","The silent forest", true , " is checked out" );
        book[1]= new Books (2,"978-0-123456-47-3","To Kill a Mockingbird", true , " is checked out" );
        book[2]= new Books (3,"978-0-123456-47-4","1984", true , " is checked out" );
        book[3]= new Books (4,"978-0-123456-47-5","Pride and Prejudice", true , " is checked out" );
        book[4]= new Books (5,"978-0-123456-47-6","The Great Gatsby", true , " is checked out" );
        book[5]= new Books (6,"978-0-123456-47-7","Moby-Dick", true , " is checked out" );
        book[6]= new Books (7,"978-0-123456-47-8","War and Peace", true , " is checked out" );
        book[7]= new Books (8,"978-0-123456-47-9","The Catcher in the Rye", true , " is checked out" );
        book[8]= new Books (9,"978-0-123456-47-10","Jane Eyre", true , " is checked out" );
        book[9]= new Books (10,"978-0-123456-47-11","Brave New World", true , " is checked out" );
        book[10]= new Books (11,"978-0-123456-47-12","The Hobbit", true , " is checked out" );
        book[11]= new Books (12,"978-0-123456-47-13","Crime and Punishment", true , " is checked out" );
        book[12]= new Books (13,"978-0-123456-47-14","The Lord of the Rings", true , " is checked out" );
        book[13]= new Books (14,"978-0-123456-47-15","Little Women", true , " is checked out" );
        book[14]= new Books (15,"978-0-123456-47-16","The Brothers Karamazov", true , " is checked out" );
        book[15]= new Books (16,"978-0-123456-47-17","Great Expectations", true , " is checked out" );
        book[16]= new Books (17,"978-0-123456-47-18","Animal Farm", true , " is checked out" );
        book[17]= new Books (18,"978-0-123456-47-19","Wuthering Heights", true , " is checked out" );
        book[18]= new Books (19,"978-0-123456-47-20","The Odyssey", true , " is checked out" );
        book[19]= new Books (20,"978-0-123456-47-21","Harry Potter and the Sorcerer’s Stone", true , " is checked out" );


        while (id) {
            System.out.println(" 1 if you want to see the list of all books");
            System.out.println(" 2 if you want to search a book by title ");
            System.out.println(" 3 if you want to search a book by ID ");
            System.out.println(" 4 if you want to see the books that are available ");
            System.out.println(" 5 if you would like to return a book ");
            System.out.println(" 6 if you want to exit ");

            int menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu){
                case 1 -> listOfBooks();
                case 2 -> searchByTitle(myScanner);
                case 3 ->  searchById(myScanner);
                case 4 -> showAvailableBooks();
                case 6 -> id= false;
            }

        }











    }public static void listOfBooks() {
        System.out.println("What book would you like to check out use 1-20" );
        System.out.println("NeighborhoodLibrary");
        for (int i = 0; i < numOfBooksCheckedOut ; i++) {
            System.out.println(book[i]);
        }
    }public static void searchByTitle(Scanner scanner) {
        System.out.println("what is the title if the book? ");
        String title = myScanner.nextLine();
        for (int i = 0; i < numOfBooksCheckedOut; i++) {
            if (book[i].getTitle().equalsIgnoreCase(title)){
                System.out.println(book[i]);
            }

        }
    } public static void searchById(Scanner scanner) {
        System.out.println("what is the id of the book you are looking for? ");
        int id = myScanner.nextInt();
        for (int i = 0; i < numOfBooksCheckedOut; i++) {
            if (book[i].getId()==id) {
                System.out.println(book[i]);

            }

        }
    } public static void showAvailableBooks () {
        for (int i = 0; i < book.length; i++) {
            if (!book[i].isCheckedOut()) {
                System.out.println(book[i]);
            }


        }
    }public static void isCheckedOUt() {

        for (int i = 0; i < book.length; i++) {
            if(book[1].getTitle().equalsIgnoreCase(title)) {
                book[i].isCheckedOut(false);

            }

        }
    }

}
