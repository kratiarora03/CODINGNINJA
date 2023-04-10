import java.util.Scanner;

public class takeinputandadd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of first integer-");
        int i= sc.nextInt();
        System.out.println("enter the value of second integer- ");
        int j = sc.nextInt();
        int sum = i+j;
        System.out.println("the sum of these two integers is " +   sum);
    }
}
