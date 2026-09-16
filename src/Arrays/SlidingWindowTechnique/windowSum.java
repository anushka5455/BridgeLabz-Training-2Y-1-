package Arrays.SlidingWindowTechnique;

public class windowSum {
    public static void main(String[] args) {
        int sum = 0;
        int size = 3;
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int n = sc.nextInt();
      int arr[] = new int [n];
        for(int i = 0;i<size;i++)
        {
            int arr = sc.nextInt();
        }
        for(int i = 0 ; i<k;i++)
        {
            sum = sum+ arr[i];
        }
        int max = sum;
        System.out.println("sum of the first window is" +sum);
        for (int i =1;i<=arr.length - size ; i++)
        {
            sum = sum - arr[i-1] + arr[i+ size -1];
            System.out.println("sum");

        }
    }
}
