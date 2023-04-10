import java.util.Scanner;

public class array4_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array you want - ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        System.out.println(sum);

        }

    }
