import java.util.Scanner;

public class BookStore {

    static Scanner myScanner = new Scanner(System.in);

    static String[] books = { "Java", "C", "Python" };
    static final double studentDiscount = 0.3;
    static final double teacherDiscount = 0.4;
    static final double alienDiscount = 0.0;

    public static void main(String[] args) {

        println("-----WELCOME TO OUR BOOKSTORE-------");
        print("Which book do you want?\nAns: ");

        String userChoice = myScanner.nextLine();

        if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
            println("You opted for " + books[0] + " book.");
            calculatePrice(books[0]);
        } else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
            println("You opted for " + books[1] + " book.");
            calculatePrice(books[1]);
        } else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
            println("You opted for " + books[2] + " book.");
            calculatePrice(books[2]);
        } else {
            println("Sorry! We dont have that book.");
        }

    }

    // methods for print
    static void println(Object newObject) {
        System.out.println(newObject);
    }

    static void print(Object newObject) {
        System.out.print(newObject);
    }

    // method for calculate
    static void calculatePrice(String bookName) {
        print("Are you Student, Teacher, or Alien? \nAns: ");

        double bookPrice = 200;
        String answer = myScanner.nextLine();
        if (answer.toLowerCase().equals("teacher")) {
            bookPrice = bookPrice - (bookPrice * teacherDiscount);
            showPrice(bookPrice);
        } else if (answer.toLowerCase().equals("student")) {
            bookPrice = bookPrice - (bookPrice * studentDiscount);
            showPrice(bookPrice);
        } else if (answer.toLowerCase().equals("alien")) {
            bookPrice = bookPrice - (bookPrice * alienDiscount);
            showPrice(bookPrice);
        } else {
            println("Sorry we can't serve you!");
        }
    }

    // method for showing total bookPrice
    static void showPrice(double bookPrice) {
        println("Your total payable amount: " + bookPrice);
        println("\n-------THANK YOU FOR SHOPPING-------");
    }
}
