import java.util.Scanner;

public class avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student");
        String name = sc.next();
        System.out.println("enter the marks of all three subjects");
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int m3= sc.nextInt();
        int avg = (m1+m2+m3)/2;
        System.out.println(name);
        System.out.println(avg);
    }
}

