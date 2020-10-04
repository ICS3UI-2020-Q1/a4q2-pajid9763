import java.util.Scanner;

/**
 * program that needs negative integer to quit
 * 
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // declare the number variable 
  int number;
  // ask the user for a number
  System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
  
  do {
    // get the user's number 
    number = input.nextInt();

    // check whether the number is positive or negative
    if (number > 0){
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
  
    } else if (number < 0){
      System.out.println("All done!");
      break;
    
    } 
    }while (number > 0);
  }
}
  
