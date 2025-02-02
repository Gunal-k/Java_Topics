public class p17 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            char val = 'A';
            for (int j = 0; j < i+1; j++) {
                System.out.print(val++);
            }

            val-=2;
            for (int j = 0; j < i; j++) {
                System.out.print(val--);
            }
            System.out.println();
        }
    }
}