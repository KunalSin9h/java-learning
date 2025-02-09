package org.basic;

// bellow is java-doc comment
// for auto generating documentations

import java.util.Scanner;

/**
 * Java Identifiers
 * These are names given to a class, variables and methods
 * Identifiers are case-sensitive
 * Rules:
 *   Starts with:
 *      alphabet
 *      _
 *      $
 *   Then followed by:
 *       alphabet
 *       _
 *       $
 *       numbers
 *  DataTypes:
 *  Primitive DataTypes:
 *      Char (2bytes)
 *      Int (Byte, Short, Int, Long)
 *      Float(Float, Double)
 *      Boolean(depends on JVM)
 *  Reference DataTypes:
 *      String
 *      Array
 */
public class Program {
    static void DataTypes() {

        // identifiers
        int $age = 10;
        int age$age = 10;
        // Identifiers are Case-Sensitive
        int group = 100;
        int Group = 200;

        System.out.println(group);
        System.out.println(Group);

        // Datatypes
        // Primitive Data Types
        int age = 10;
        // Stack Allocated

        // Reference Data Types
        Scanner scan = new Scanner(System.in);
        // here scan is reference data types
        // Heap Allocated
        // when ever we use `new` then data is allocated on heap
        // we reference that data in stack.


    }

    static void ArithmeticOperations() {
        byte one = 1;
        byte two = 2;

        // Explicit Conversion
        byte result = (byte) (one + two);
        // one + two by default is int
        System.out.println(result);

        String name;
    }

    static void CastingAndConversion(){
        // Implicit Conversion
        int i = (byte) 1;
    }
}
