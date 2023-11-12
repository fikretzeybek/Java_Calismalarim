package F18;

class Student1 {
    int numara;
    String name;
    static String college = "ITS";

    Student1(int r, String n) {
        numara = r;
        name = n;
    }

    void display() {
        System.out.println(numara + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student1 s1 = new Student1(111, "Kenan");
        Student1 s2 = new Student1(222, "Ceren");

        s1.display();
        s2.display();
    }
}