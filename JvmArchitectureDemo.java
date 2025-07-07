public class JvmArchitectureDemo {
    static int counter = 0; // Stored in Method Area (static variable)

    public static void main(String[] args) {
        Person p1 = new Person("Alice");  // Stored in Heap
        p1.sayHello();                    // Runs on Stack
        callNativeMethod();              // (Simulated native call)
    }

    // Simulated native method
    public static void callNativeMethod() {
        System.out.println("Simulated native method call (like using JNI)");
    }
}

class Person {
    String name; // Stored in Heap

    Person(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
