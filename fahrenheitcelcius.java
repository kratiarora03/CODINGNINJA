import java.util.Scanner;

public class fahrenheitcelcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the fahrenheit value - ");
        int f = sc.nextInt();
        int cel = (5/9)*(f-32);
        System.out.println(cel);



    }
}
