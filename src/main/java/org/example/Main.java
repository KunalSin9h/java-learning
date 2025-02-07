package org.example;

// Scanner Class
import java.util.Scanner;

/**
 * Java Editions
 * 1. J2SE - Java Standard Edition - Desktop & Normal Server Applications
 * 2. J2EE - Java Enterprise Edition - Enterprise Server Applications
 * 3. J2ME - Java Micro Edition - Phones & IOT
 */

public class Main {
    public static void main(String[] args) {
//        Program.DataTypes();
        Program.ArithmeticOperations();

        // New object of Scanner Class
        Scanner scan = new Scanner(System.in); // Keyboard Input
        // ClassName obj_name = new ClassName(Constructor Parameters)

        float f = scan.nextFloat();
        System.out.printf("Original : %f , Rounded to 2 decimal places: %.2f\n", f, f);

        scan.close();
    }
}