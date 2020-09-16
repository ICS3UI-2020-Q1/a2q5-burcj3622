import java.util.Scanner;
/**
 *fizzbuzz
 * @author jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner for user input 
    Scanner input = new Scanner(System.in);

    //asks user for input
    System.out.println("Please enter a number to play FizzBuzz");
    
    //user input
    int number = input.nextInt();

    int fizz = (number%3);
    int buzz = (number%5);

    if (fizz == 0 && buzz == 0){
    System.out.println("you should say fizzbuzz");
    }
    
    else if (fizz == 0){
      System.out.println("you should say fizz");
    }
    else if (buzz == 0){
      System.out.println("you should say buzz");
    }
  else if (buzz != 0 && fizz != 0){
    System.out.println("you should say "+ number);
  }
    
    
  }   

}
    

    
  

