package arrays;

class Student {

}

/**
 * Arrays
 */
public class Main {
    public void strings(){
        // String is immutable
        String name = new String("Hello"); // heap
        String surname = "Singh"; // String Pool

        // string length is a method
        System.out.println(name.length());

        // equals
        if("Hello".equals("Hello")){
            System.out.println("Hello");
        }
        if("hello".equalsIgnoreCase("HELLO")) {
            System.out.println("hello");
        }

        // They are on heap hense, different refernece
        // but same data

/*        String one = new String("One");
        String two = new String("One");*/

        String one = "one";
        String two = "one";

        // equals use kerna tha

        // == chekcs only refernce
        if(one.equals(two)){ // always false if check only reference
            System.out.println("YEs");
        } else {
            System.out.println("NOs");
        }

        char[] c = {'a', 'b', 'c'};
        String c1 = new String(c);

        String a = null;

        // char
        // Character // java.lang // java.lang is by default included
        // static method on Character
        if (Character.isDigit('0') ){
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        new Main().strings();

        float[] array = new float[10];
        // array is a reference data types
        // see use of new keyword

        int[] a;
        int b[];

        // initialization
        int values[] = {1, 2, 3, 5, 6};
        int vals[] = new int[10];
        int valss[] = new int[]{1, 2, 2};

        System.out.println(array.length);

        Student[] students = new Student[10];
        // new int[10];
        // new boolean[100];

        // this() ->  calling no-argument of current class
        // super() ->  calling no-argument of parent class


        // 2D array
        // Grid (Rectangular Array)
        int[][] two = new int[10][10];

        // Jagged Array
        int[][] jagged = new int[3][];
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];
    }

    // variable arguments
    // there can only be one variable argument in the function
    // that too should be last
    public static int sum(int... values) {
        int sum = 0;
/*        for (int value: values) {
            sum += value;
        }*/
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    // Arrays package
    // java.util.Array;


}
