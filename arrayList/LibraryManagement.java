package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    @Override
    public String toString() {
        return "Book ID : " + id +
               "\nTitle   : " + title +
               "\nStatus  : " + (issued ? "Issued" : "Available");
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== LIBRARY MENU ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    books.add(new Book(id, title));

                    System.out.println("Book Added Successfully.");
                    break;

                case 2:

                    if (books.isEmpty()) {
                        System.out.println("Library is Empty.");
                    } else {

                        for (Book b : books) {
                            System.out.println("----------------------");
                            System.out.println(b);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Search : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {

                        if (b.id == searchId) {

                            System.out.println("----------------------");
                            System.out.println(b);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Book ID to Issue : ");
                    int issueId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == issueId) {

                            found = true;

                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book Already Issued.");
                            }

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Book ID to Return : ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == returnId) {

                            found = true;

                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book was not Issued.");
                            }

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 6:

                    System.out.print("Enter Book ID to Delete : ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < books.size(); i++) {

                        if (books.get(i).id == deleteId) {

                            books.remove(i);
                            found = true;
                            System.out.println("Book Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 7:

                    System.out.println("Thank You.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }

        }

    }

}