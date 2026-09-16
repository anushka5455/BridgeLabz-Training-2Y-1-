package Arrays.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode_88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        System.out.println("Merged array: " + Arrays.toString(nums1));

        sc.close();
    }
}