import java.util.Scanner;

public class inputandfingodd_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rem = n%2;
        if (rem==0){
            System.out.println("the number is even");
        }else{
            System.out.println("odd");
        }
    }
}

