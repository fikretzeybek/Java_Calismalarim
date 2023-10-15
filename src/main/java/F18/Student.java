package F18;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Age of the Student: " + this.age);
    }

    public static void main(String args[]) {
        //Reading values from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = scanner.nextLine();

        System.out.println("Enter the age of the student: ");
        int age = scanner.nextInt();

        //Calling the constructor that accepts both values
        new Student(name, age).display();
    }
}