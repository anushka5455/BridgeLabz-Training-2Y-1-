package string;

public class removeCharacter {
    public static String remove(String name, int index) {
        if (index == name.length()) {
            return "";
        }
        String small = remove(name, index + 1);
        char ch = name.charAt(index);
        if (ch != 'a') {
            return ch + small;
        } else {
            return small;
        }
    }

    public static void main(String[] args) {
        String name = "anushka";
        System.out.println(remove(name, 0));

    }
}
