import java.util.Scanner;

public class largestof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        if (a>=b && a>=c && a>=d && a>=e){
            System.out.println("the largest number is "  + a);
        }else{
            if(b>=c && b>=d && b>=a && b>=e){
                System.out.println("the largest number is  "  + b);
            }else{
                if(c>=a && c>=b && c>=d && c>=e){
                    System.out.println("the largest number is " + c);
                }else{
                    if(d>=e){
                        System.out.println("the largest number is " + d);
                    }else{
                        System.out.println("the largest number is " + e);
                    }
                }
            }
        }
    }
}
