import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;     //upper triangle
        while(i<=n) {
            int j = 1;    //spaces
            while (j <= n-i) {
                System.out.print(" ");
                j++;
            }
            j = 1;  //stars
            while (j++<(2*i)-1) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;

        }
        while(i>0){
            int j = 0;
            while(j++<n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j++<(i*2)-1){
                System.out.print("*" +  " ");
                j++;
            }
            System.out.println();
            i--;




        }
    }
}
