package Mastermind;
import java.util.*;
class Guess {
  //constructor for Guess
  public Guess(ArrayList<GuessSlot> guess){
    this.guess = guess;
  }
  //Im creating this array to use in some catch and throw blocks
  public static int[] array = {0, 1, 2, 3, 4, 5};
  //this variable is gonna be used for to track if the usered inputs pass a check
  boolean check = false;
  //this variable will temperarily store user inputs to test if they are the correct data type and in the correct range
  int activeGuess;

  //this is an Array which will contain GuessSlots
  public ArrayList<GuessSlot> guess = new ArrayList<GuessSlot>();
  
  //Scanner object for getting user input
  Scanner sc = new Scanner(System.in);

  //this method load the guess slots into the guess array
  public void addSlot(GuessSlot guessSlot){
    this.guess.add(guessSlot);
  }
  //this methode takes user inputs, checks them, and adds them to the GuessSlots in the guess array list if they pass the check
  public void generateGuess(ArrayList<GuessSlot> guess){
    for(GuessSlot guessSlot : guess){
      //this while statement will run until the input passes the check
      while(check == false){
        //the check is set to true
        check = true;
        //this try block will attempt to use the user input as an index for the integer array
        try {
        //if the user entered and intiger between 0 and 5, the digit paramiter in the active GuessSlot will be set to the user input
          activeGuess = sc.nextInt();
          guessSlot.setSlot(array[activeGuess]);
        //if what the user entered was not an intiger between 0 and 5 an exeption will be thrown to one of these catch block
        }catch(InputMismatchException ex){
          //a message telling the user to reenter thier guess
          System.out.println("You entered something that was not an integer.\nPlease try entering the digit again.");
          //when I first tried this try/catch block I kept getting stuck an infinite loop whenever there was a InputMismatchException.
          //when I looked up it up the solution was to add the following
          sc.next();
          //the check is set back to false locking the user in the while loop until they give the correct input
          check = false;
        }catch(ArrayIndexOutOfBoundsException ex){
          System.out.println("You entered an integer that was not between 0 and 5.\nPlease try entering the digit again.");
          //the check is set back to false locking the user in the while loop until they give the correct input
          check = false;
        }
      }
      //check is reset to false at the end of every for loop to ensure the while loop runs at least once every for loop
      check = false;
    }
  }
}