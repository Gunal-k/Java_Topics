public class p15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            char val = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }    
}
