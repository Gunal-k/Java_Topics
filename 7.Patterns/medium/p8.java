public class p8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>0;i--){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}