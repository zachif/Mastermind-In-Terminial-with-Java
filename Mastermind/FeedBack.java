package Mastermind;
import java.util.*;
class Feedback{
  //constructor for FeedBack
  public Feedback(ArrayList<FeedbackSlot> feedback){
    this.feedback = feedback;
  }

  //this array will contain feedback slots
  public ArrayList<FeedbackSlot> feedback = new ArrayList<FeedbackSlot>();

  //this method loads the feedback slots into the feedback array
  public void addSlot(FeedbackSlot feedbackSlot){
    this.feedback.add(feedbackSlot);
  }

  //this method will compare the guesses and solutions, assign the correct character to the feedback slots, and display the feedback for the user
  public void giveFeedback(ArrayList<GuessSlot> guess, ArrayList<SolutionSlot> solution, ArrayList<FeedbackSlot> feedback){
    //this variable will keep track of wether the feedback slot has been assigned a character in the current loop
    boolean check = false;
    //for looping through the feedback and guess arrays
    for(int i = 0; i < 4; i++){
      //resets check to false at the start of the loop
      check = false;
      //loops through the solution array
      for(SolutionSlot solutionSlot : solution){
        //checks if both the digit and position match for the active guess and solution slots
        if(guess.get(i).getDigit() == solutionSlot.getDigit() && guess.get(i).getPosition() == solutionSlot.getPosition()){
          //assigns the feedback slot the character for right number right position
          feedback.get(i).rNrP();
          check = true;
        }
        //checks if the digit is a match for the solution and guess slots and checks that feed back slot hasn't already been assigned a character
        else if(guess.get(i).getDigit() == solutionSlot.getDigit() && check == false){
          feedback.get(i).rNwP();
        }
      }
    }
  }
}
