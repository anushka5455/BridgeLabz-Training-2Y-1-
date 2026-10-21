package string;

public class palindromeString {

        public static boolean rev(String name, int start , int end)
        {
            if(name.charAt(start)!=name.charAt(end))
            {
                return false;
            }
            if (start >= end) {
                return true;
            }
           return rev(name , start+1 , end -1);

        }

        public static void main(String[] args) {
            String name = "madam";
            System.out.println(rev(name , 0 , name.length()-1));
        }
}

