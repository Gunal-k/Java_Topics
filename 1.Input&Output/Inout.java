import java.io.*;

class Inout {
    public static void main(String args[]) throws IOException {
        // Create a BufferedReader to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n; // Variable to store the integer input
        
        System.out.print("Enter a Number: ");
        
        // Read a line of text from the console
        // Convert the string input to an integer
        n = Integer.parseInt(br.readLine());
        
        // Print the integer to the console
        System.out.println(n);
    }
}