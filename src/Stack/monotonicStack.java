import java.util.Stack;
public class monotonicStack {
    public static void main(String[] args) {
        int arr[] = {7,55,3,9,2,33};
        Stack<Integer> st = new Stack<>();
        for (int value : arr){
            while (!st.isEmpty() &&  st.peek() <value){
                st.pop();
            }
            st.push(value);
        }
        System.out.println("decreasing stack :" +st);
    }
}
