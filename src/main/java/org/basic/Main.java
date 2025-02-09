package org.basic;
// declare a file nin package, just like go

// Scanner Class
import java.util.Scanner;

//import org.oops.Class;

/**
 * Java Editions
 * 1. J2SE - Java Standard Edition - Desktop & Normal Server Applications
 * 2. J2EE - Java Enterprise Edition - Enterprise Server Applications
 * 3. J2ME - Java Micro Edition - Phones & IOT
 */

public class Main {
    public static void main(String[] args) {

//        Program.DataTypes();
//        Program.ArithmeticOperations();
//        Operators.operators();
//        ControlStructure.decisionMaking();
//        ControlStructure.loops();
//        ControlStructure.mics();
//        Class.AccessSpecifiers();


        // New object of Scanner Class
        Scanner scan = new Scanner(System.in); // Keyboard Input
        // ClassName obj_name = new ClassName(Constructor Parameters)

        int a = scan.nextInt();
        System.out.println(a);
        float f = scan.nextFloat();
        System.out.println(f);
        byte b = scan.nextByte();
        System.out.println(b);
        short s = scan.nextShort();
        System.out.println(s);
        long l = scan.nextLong();
        System.out.println(l);
        double d = scan.nextDouble();
        System.out.println(d);
        boolean bl = scan.nextBoolean();
        System.out.println(bl);
        String str = scan.next();
        System.out.println(str);
        String line = scan.nextLine();
        System.out.println(line);
        char c = scan.next().charAt(0);
        System.out.println(c);

        scan.close();

    }
}