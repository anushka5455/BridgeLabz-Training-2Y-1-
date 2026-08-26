import java.util.Scanner;

public class Power {
    public static long power(int a, int n) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * a;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter exponent: ");
        int n = sc.nextInt();

        System.out.println("Answer = " + power(a, n));
    }
}