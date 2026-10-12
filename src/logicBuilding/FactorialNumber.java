package logicBuilding;
import java.util.Scanner;
public class FactorialNumber {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int small = fact(n-1);
        return small*n;
    }

    public static void main(String[] args) {


        System.out.println(fact(5));
    }
}
