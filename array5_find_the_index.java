import java.util.Scanner;

public class array5_find_the_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int elements_in_array [] = new int[size];
        for(int i = 0 ; i<size ; i++){
            elements_in_array[i] = sc.nextInt();
        }
        int index_value=0;
        for(int j = 0; j<elements_in_array.length; j++){
            index_value = j;
            System.out.println(j + "  ");



        }
    }
}
