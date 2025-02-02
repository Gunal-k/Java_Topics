import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i =1;
        while(i<11){
            System.out.println(n+"X"+i+"="+n*i);
            i++;
        }
        sc.close();                                                                                                                                                                                                                                                                                               
    }
}
