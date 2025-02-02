import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a =new int[10] ;
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Arr["+i+"] => "+a[i]);
        }
        sc.close();
    }
}
