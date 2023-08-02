import java.util.Scanner;

class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Hi there!");
        
        System.out.print("Enter a number please: ");

        
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

         System.out.print("Thank you for using OddEvenChecker!");
         

        scanner.close();
    }
}
