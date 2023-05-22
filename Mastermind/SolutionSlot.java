package Mastermind;
import java.util.*;

class SolutionSlot implements SlotSetter{

  //The SolutionSlots are each going to contain one digit of the solution as well as its postion in the solution.
  int position;
  int digit;

  //constructor for SolutionSlot
  public SolutionSlot(int position, int digit){
    this.position = position;
    this.digit = digit;
  }

  //sets the info in the slot
  @Override
  public void setSlot(){
    Random r = new Random();
    //assigns a random whole number value between 9 and 0 to the solution digit
    this.digit = r.nextInt(6);
  }
  
  //gets the postion for comparison
  public int getPosition(){
    return this.position;
  }
  
  //gets the digit for comparison
  public int getDigit(){
    return this.digit;
  }

  
}