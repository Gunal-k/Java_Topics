import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks = sc.nextInt();
        if(marks>95){
            System.out.println("Distinction");
        }
        else if(marks>=90){
            System.out.println("First Class");
        }
        else if(marks>=80){
            System.out.println("Second Class");
        }
        else if(marks>=70){
            System.out.println("Third Class");
        }
        else if(marks>=60){
            System.out.println("Fourth Class");
        }
        else if(marks>=50){
            System.out.println("Fail");
        }
        sc.close();
    }
}
