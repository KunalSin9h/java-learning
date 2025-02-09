package org.basic;

/**
 * Operators are special symbols that perform operations on the operand
 * and give the result.
 * Operators Type:
 *      Arithmetic
 *      Bitwise
 *          >>> Right Shift Zero Fill Operator
 *      Unary
 *      Ternary
 *      Local & Relations
 *      Misc
 *          instanceof
 *  Precedence And Associativity
 *  Precedence determines the order in which the operators in an expression are evaluated.
 *  If two operators have same precedence (equal priority) then they are evaluated through associativity *   is either Left->Right or Right->Left
 */
public class Operators {
    static void operators() {
        System.out.println(-8 >>> 2); // 10

        // instanceof operator

        String s = "Hello";
        if(s instanceof String) {
            System.out.println("YES");
        }
    }
}
