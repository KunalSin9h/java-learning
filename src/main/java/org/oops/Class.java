package org.oops;

// this is also been used in golang

// `package` keyword need to be the first line of the code
// else cte

/**
 * Objects can be created from Class
 * using `new` keyword
 * <p>
 * In JAVA all objects are created at runtime in HEAP
 * जब भी कोई new कीवर्ड होता है तो आवंटन HEAP पर होता है!
 */
public class Class {
    private String name;

    // static modifier
    // modifies the default behaviour of something
    public static int times = 100;

    // static block
    static {
        int a = 10;
        int b = 20;
        int c = 30;
    }

    /**
     * Constructor
     * 1. Implicit Constructor
     * 2. Explicit Constructor (User Defined)
     *      2.1. No Argument Constructor
     *      2.2. Parameterized Constructor
     */
    Class() {
        // Invoking one constructor from other
        // using this keyword
        this("");
    }

    // Parameterized constructor
    Class(String name) {
        this.name = name;
    }

    // Method overloading
    void a(int b) {

    }
    void a(int b, int c) {

    }

    public static void  AccessSpecifiers() {
        // 4 Access Specifiers in Java

        // Public (any one can access this)
        // Protected
        // Private

        // Default (only same package can access this, no keyword to represent default)
    }

    public static void main(String[] args) {

    }
}
