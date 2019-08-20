
/**
 * Every Java program contains one or more classes (e.g. HelloPrinter)
 * 
 * In general, every source file (HelloPrinter.java) contains one class (HelloPrinter)
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 * @author Mr. Callaghan 
 * @version 20 Aug 2019
 */
public class HelloPrinter  //class header
{
    /**
     * A class contains methods.
     * 
     * Every Java application contains a class with a main method.
     * 
     * THe main method is executed when the application starts.
     */
    public static void main(String[] args)  // method header for main method
    {
        System.out.println("Hello, world.");  // Java print statement
        
        // this is a single-line comment (like # in python)
        
        /*
         * Identifiers are any combination of:
         *      letters
         *      digits(but not the first character)
         *      underscores
         *      dollar signs
         *      
         *      These are various identifiers:
         */
        
        int y, x2, x_x, X$;
        
        //This is not a valid identifier:
        //int 2y;
        
        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are 3 different identifiers:
         */
        String box, BOX, Box;
        
        /*
         * By convention, constants are all uppercase.
         *      Use underscores to separate words
         */
        
        int SPEED_OF_LIGHT = 300000000;
        
    }
}