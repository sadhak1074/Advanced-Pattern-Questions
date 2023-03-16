public class number_pyramid {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            int  s = n-i;
            for(int j=s; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
