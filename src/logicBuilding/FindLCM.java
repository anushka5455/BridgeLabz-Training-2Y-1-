
package logicBuilding;

public class FindLCM {
    public static int lcm(int x, int y) {
        if (y == 0) {
            return x;
        }
        return lcm(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println((12 * 16) / lcm(12, 16));
    }
}
