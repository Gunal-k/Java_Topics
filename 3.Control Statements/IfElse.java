import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n>50){
            System.out.println("Greater than 50");
        }
        else{
            System.out.println("Lesser than 50");
        }
        sc.close();
    }
}
