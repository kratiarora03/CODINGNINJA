import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int startingrownumber=i;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(startingrownumber);
                startingrownumber++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
