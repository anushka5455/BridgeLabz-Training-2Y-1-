import java.util.*;

class leetcode739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prev = st.pop();
                arr[prev] = i - prev;
            }
            st.push(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] temperatures = new int[n];

        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }

        int[] answer = new leetcode739().dailyTemperatures(temperatures);

        for (int i = 0; i < answer.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer[i]);
        }

        scanner.close();
    }
}