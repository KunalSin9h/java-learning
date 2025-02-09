package rx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Regular Expression (RegEx)
 * <p>
 * JAVA 4
 * It has 1 Interface and 3 Classes
 * <p>
 * Character Class
 * [a-z]
 * [0-9_abc]
 * [a-z&&[^xyz]]
 * </p>
 *  <p>
 * Quantifiers
 * X? -> Once or none (1 or 0)
 * X+ -> Once or More (1 or >1)
 * X* -> Zero or more time (0 or >0)
 * X{n} -> X occurs n times only (n)
 * X{n,} -> X occurs n or more time (>=n, at least n)
 * X{y,z} -> [y, z)
 * <p>
 *  Meta Characters
 *  . -> any characters
 *  \d -> any digit short for [0-9]
 *  \D -> any non digit short for [^0-9]
 *  \s -> any whitespace character
 *  \S -> any non whitespace character
 *  \w -> any word short for [a-zA-Z_0-9]
 *  \W -> any non word
 */
public class RX {
    public static void main(String[] args) {
        // Compile a regex pattern
        // probably convert it to AST
        Pattern pattern = Pattern.compile("[1-3]{2}");

        // direct
        // simple version
        if(Pattern.matches("[7-9][0-9]{9}", "9030889999")) {
            System.out.println("Yes a correct Indian Phone Number");
        }

        // Regex matcher engine
        Matcher matcher = pattern.matcher("31");

        if(matcher.find()){
            System.out.println(matcher.group());
        }

        // String class has matches
        if("Kunal".matches("\\w*")) {
            System.out.println("Yes, that is a word");
        }
    }
}
