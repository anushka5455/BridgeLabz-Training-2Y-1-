package arrays;

public class printArray {
public static void printInc(int arr[] , int index)
{
    if(index==arr.length)
    {
        return ;
    }
    System.out.println(arr[index]);
    printInc(arr , index+1);
}
    public static void reverse(int arr[] , int index)
    {
        if(index<0)
        {
            return ;
        }
        System.out.println(arr[index]);

        reverse(arr , index-1);
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
        System.out.println("printInc");
        printInc(arr , 0);
        System.out.println("reverse");
        reverse(arr , arr.length-1);
    }
}


