import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n){
            char startingchar= (char)('A' + i -1);
            int j=1;
            while(j<=n){
                System.out.print(startingchar);
                startingchar = (char)(startingchar +1);
                j++;


            }
            System.out.println();
            i++;
        }
    }
}
