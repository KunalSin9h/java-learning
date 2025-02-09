package org.basic;

/**
 * Watch-out for Labels:
 */

public class ControlStructure {
    static void decisionMaking() {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("A is the grade");
                break; // exit switch
            case 'B':
                System.out.println("B is the grade");
                break; // exit switch
            default:
                System.out.println("Grade: N/A");
        }
    }

    static void loops() {
        // for loop
        // while loops
        // do while (same as c++)

        int a = 0;

        do {
            System.out.println(a);
            a++;
        } while(a <= 10);
    }

    static void exception() {

    }

    static void mics() {
        // Labels:
        // wtf

        // Labels can be used with loop statements like for or while.
        // in conjunction with the break and continue statements.

        // outer label
        outer:
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    System.out.printf("%d %d\n", i, j);
                    if(j == 3) {
                        continue outer;
                        // will have same effect of doing
                        // just break
                    }
                }
            }
    }
}
