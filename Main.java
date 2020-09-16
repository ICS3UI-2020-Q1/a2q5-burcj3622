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

    int Fizz = (number%3);
    int Buzz = (number%5);

    if (Fizz == 0 && Buzz == 0){
    System.out.println("you should say FizzBuzz");
    }
    
    else if (Fizz == 0){
      System.out.println("you should say Bizz");
    }
    else if (Buzz == 0){
      System.out.println("you should say Buzz");
    }
  else if (Buzz != 0 && Fizz != 0){
    System.out.println("you should say "+ number);
  }
    
    
  }   

}
    

    
  

