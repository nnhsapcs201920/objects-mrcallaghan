import java.awt.Color;

public class TurtleDemo
{
    public static void makeAwesomeTurtlePattern()
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);        
    }
    
    public static void chapter2Notes()
    {
        /*
         * Variables store values to be used later.
         *      Variables have a type (e.g. int), a name (e.g. width), and a value (e.g. 20).
         */  
        
        int width;   //declaring a variable
        width = 20;  //assigning a variable
        
        /*
         * Java has several primitive data types:
         *      boolean holds a value of true or false
         *      int holds an integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double taxRate = 0.075;
        
        // here is a char
        char letter = 'c';
    
    }

}