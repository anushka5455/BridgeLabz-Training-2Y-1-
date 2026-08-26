import java.util.Scanner;

public class SwapArray {

    public static void swap(int arr[]) {
        int temp = arr[2];
        arr[2] = arr[5];
        arr[5] = temp;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        swap(arr);

        System.out.println("Array after swapping:");
        display(arr);

        sc.close();
    }
}