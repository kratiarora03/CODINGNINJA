import javax.swing.*;
import java.util.Scanner;

public class seachingintegervalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int a = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(value==i){
                System.out.println("present");
            }
            else{
                System.out.println("not present");
            }

        }


    }
}


