package arrays;

public class SumOfElements {
    public static int sum(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }
        int add = arr[index] + sum(arr, index + 1);
        return add;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 13, 4, 5};
        System.out.println(sum(arr, 0));
    }
}
