import java.util.Scanner;

public class array3_avg_of_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];                      //asking the user to input the numbers in an array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;                                     //sum of numbers stored in array
        for(int i=0; i < arr.length ; i++)
            sum = sum + arr[i];

        double avg = sum / arr.length;                           // average
        System.out.println(avg);


    }
}
