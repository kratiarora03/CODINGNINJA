import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            char startingchar= (char)('A' + i -1);
            while(j<=i){
                System.out.print((char)('A' + i -1 ));
                j++;


            }
            System.out.println();
            i++;
        }
    }
}
