package pkgs;


/**
 * Classpath
 * the list of directories or the jar files location
 * JAR -> Java ARchive
 * <p>
 * Using -cp command line argument
 * -classpath
 */
public class Wrapper {
    // Wrapper class are available in java.lang package

    public static void wrapperClass() {
        // Instantiating wrapper class in 3 ways
        // 1.
        Integer i = new Integer(1);

        // 2.
        // JAVA 5 (auto boxing)
        Double d = 0.3;

        // unboxing
        double dd = d;

        // 3.
        // using .valueOf() method
        Boolean b = Boolean.valueOf(true);
        // for sure .valueOf is a static method in Boolean Class


        // all wrapper class has .parseXXX() method
        Integer age = Integer.parseInt("22");
        // here also
    }
}

/**
 * Why do we need wrapper class
 * Java has primitive types
 * But Collection framework only work with Objects
 * So we wrapped the
 */