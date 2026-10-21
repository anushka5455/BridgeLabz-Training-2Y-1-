package string;

public class reverseString {
    public static void print(String name, int index)
    {
        if(index==name.length())
        {
            return;
        }
        print(name , index+1);
        System.out.println(name.charAt(index));
    }

    public static void main(String[] args) {
        String name = "anushka";
        print(name , 0);
    }
}
