package LinkedList;

public class Student {
    String name ;
    public Student(String name){

        this.name = name;
    }

    public static void main(String[] args) {
        Student obj = new Student("anushka");
        System.out.println(obj.name);
    }
}
