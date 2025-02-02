import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int large = a;
        if(b > large){
            if(c>b){
                large = c;
            }
            else {
                large = b;
            }
        }
        else{
            large = c;
        }
        System.out.println(large + " is Greater");
        sc.close();
    }
}
