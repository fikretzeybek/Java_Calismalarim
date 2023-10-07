package F13;

// Create a MyClass class
public class F03_MyClass {
    int x;  // Create a class attribute x

    // Create a class constructor for the MyClass class
    public F03_MyClass() {
        x = 5;  // Set the initial value for the class attribute x to 5
    }

    public static void main(String[] args) {
        // Create an myObj object of class MyClass (This will call the constructor)
        F03_MyClass myObj = new F03_MyClass();
        // Print the value of x
        System.out.println(myObj.x);// 5
    }
}