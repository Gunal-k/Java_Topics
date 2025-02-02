import java.util.Scanner; // Import the Scanner class from the java.util package

public class Inti {
    public static void main(String[] args) {
        // Create a Scanner to read input from the console
        Scanner sc = new Scanner(System.in);
        
        int n; // Variable to store the integer input

        System.out.print("Enter a Number: ");
        
        // Read an integer from the console
        n = sc.nextInt();
        
        // Print the integer to the console
        System.out.println("Addition: "+n+n);
        System.out.println("Subtraction: "+ (n-2) );
        System.out.println("Multiplication: "+n*n);
        // Close the Scanner
        sc.close();
    }
}
