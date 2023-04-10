import java.util.Scanner;

public class inttostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("one");
        }else{
            if(a==2){
                System.out.println("two");
            }else{
                if(a==3){
                    System.out.println("three");
                }else{
                    System.out.println("wrong input");

                }
            }
        }
    }
}
