public class p16 {
    public static void main(String[] args) {
        int n = 5;
        char val = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
            }
            val++;
            System.out.println();
        }
    }    
}
