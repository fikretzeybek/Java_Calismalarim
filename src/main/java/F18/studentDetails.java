package F18;

public class studentDetails {

    studentDetails() {
        System.out.println("Default constructor");
    }

    private String n1;

    studentDetails(String name) {
        this.n1 = name;
        System.out.println("Parameterized constructor with one String argument.\n" + "Name: " + n1);
    }

    private int n2;

    studentDetails(String name, int age) {
        this.n1 = name;
        this.n2 = age;
        System.out.println("Parameterized constructor with one string and one integer argument.\n" + "Name:" + n1 + " Age:" + n2);
    }

    public static void main(String[] args) {

        //Invoking default constructor
        studentDetails s1 = new studentDetails();

        //Parameterized constructor with one String parameter.
        studentDetails s2 = new studentDetails("Serdar King");

        //Parameterized constructor with one String and one integer  parameter.
        studentDetails s3 = new studentDetails("Mert Meric", 21);
    }
}
