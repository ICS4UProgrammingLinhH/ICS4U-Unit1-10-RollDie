// import 
import java.util.Random;
import java.util.Scanner;

/**
 * Class Roll Die.
* This program randomly generates 
* number between 1 and maxValue

* @author  Linh Ho
* @version 1.0
* @since   2020-09-26
*/

public class RollDie {
  
  /**
   * Required javadoc.
  */
  
  // declare variable 
  static int maxValue;
  static int minValue;
  
  /**
   * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // Call procedure
    procedure(minValue, maxValue);
  }
  
  /**
   * Required javadoc.
  */
  
  public static void procedure(int minValue, int maxValue) { 
    
    // allow user to input
    Scanner userMinInput = new Scanner(System.in);
    
    // randomly generate a value between 1 and maxValue
    Random randomNum = new Random(); 
    
    // ask user for min value
    System.out.println("Please enter min value for random number: ");
    
    // set input to min value
    minValue = userMinInput.nextInt();
    
    // ask user for max value
    System.out.println("Please enter the max value for the random number: ");
    
    // scanner for max input
    Scanner userMaxInput = new Scanner(System.in);
    
    // set input to max/min value
    maxValue = userMaxInput.nextInt();

    // generate random numbers between 1 - 6
    //int random = randomNum.next(minValue, maxValue);
    
    int random = (int) (Math.random() * ((maxValue - minValue) + 1)) + minValue;
    
    // display the random number
    System.out.println("Random number is: " + random);
  }
}