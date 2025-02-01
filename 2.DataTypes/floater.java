import java.util.Scanner;

public class floater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float n = sc.nextFloat();

        System.out.println("Division: "+ n/(n-1));
        sc.close();
    }
}
