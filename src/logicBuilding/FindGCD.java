package logicBuilding;

public class FindGCD {
    public static int gcd(int x , int y)
    {
        if(y==0)
        {
            return x;
        }
        int result = gcd(y , x%y);
                return result;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12 , 16));
    }
}
