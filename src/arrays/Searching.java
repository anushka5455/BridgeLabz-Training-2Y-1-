package arrays;

public class Searching {
    public static int search(int arr[] , int index , int target)
    {
        if(index==arr.length)
        {
            return -1;
        }

        if(target==arr[index]) {
            return index;
        }
            int small = search(arr , index+1 , target);
        return small;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,13,4,5};
        System.out.println(search(arr , 0 , 4));
    }
}


