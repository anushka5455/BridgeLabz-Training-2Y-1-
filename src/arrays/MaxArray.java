
package arrays;
import java.util.Scanner;
public class MaxArray {
    public static int max(int arr[] , int index)
    {
        if(index==arr.length-1)
        {
            return arr [index];
        }
        int small = max(arr , index+1);
        return Math.max(small , arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,13,4,5};
        System.out.println(max(arr , 0));
    }
}
