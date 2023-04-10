import java.util.Scanner;

public class inputforsimpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle amount - ");
        int p= sc.nextInt();
        System.out.println("enter the rate of interest - ");
        int r= sc.nextInt();
        System.out.println("enter the time - ");
        int t = sc.nextInt();
        int si= (p*r*t)/100;
        System.out.println("the simple interest is  " +  si);
    }
}
