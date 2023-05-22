package Mastermind;
import java.util.*;
class Main {//Note
    public static void main(String[] args) {
      System.out.println("\nWelcome to Mastermind!\nMastermind is game where you guess a random\n4 digit code made up of nonrepeating digits from 0 through 5.\nAfter you guess 4 digits, you will get feedback on your guess.\nIf one of the numbers you guessed is in the code but you guessed in the wrong position, \nthe character \"X\" will be displayed below it.\nIf one of the numbers you guessed is in the code and in the right position,\nthe character \"O\" will be displayed below it.\nFor example:\nIf the code was \"1 2 3 4\" and you guessed \"3 2 0 1,\"\nthe console will display:\n3 2 0 1\nX O   X\nWith this feedback we can deduce that the digits 3 and 1 are present in the code\nbut not in the position we have them in,\nand 2 is the second digit in the code.\nStart guessing by typing 4 digits between 0 and 5.\npress ENTER after each digit.\n");
      
      //constructing some SolutionSlot objects
      SolutionSlot solution1 = new SolutionSlot(1,10);
      SolutionSlot solution2 = new SolutionSlot(2,10);
      SolutionSlot solution3 = new SolutionSlot(3,10);
      SolutionSlot solution4 = new SolutionSlot(4,10);
  
      //constructing a solution array list
      ArrayList<SolutionSlot> solutionArray = new ArrayList<SolutionSlot>();
  
      //constructing a Solution object
      Solution solution = new Solution(solutionArray);
  
      //adding the SolutionSlot objects to the Solution object
      solution.addSlot(solution1);
      solution.addSlot(solution2);
      solution.addSlot(solution3);
      solution.addSlot(solution4);
  
      //generating a 4 digit code of random not repeating integers between 0 and 9
      solution.generateSolution(solution.solution);
  
      //for(SolutionSlot solutionSlot : solution.solution){
        //System.out.print(solutionSlot.getDigit()+" ");
      //}
      System.out.println("");
        
      //this variable will keep track of if the user has guessed the code
      boolean win = false;
  
      //this loop runs unti the user guesses the code
      while(win == false){
        //constucting GuessSlot objects
        GuessSlot guess1 = new GuessSlot(1,10);
        GuessSlot guess2 = new GuessSlot(2,10);
        GuessSlot guess3 = new GuessSlot(3,10);
        GuessSlot guess4 = new GuessSlot(4,10);
  
        //constructs a guess array list
        ArrayList<GuessSlot> guessArray = new ArrayList<GuessSlot>();
  
        //constructs a guess object
        Guess guess = new Guess(guessArray);
        //adding the guessSlot objects to the Guess object
        guess.addSlot(guess1);
        guess.addSlot(guess2);
        guess.addSlot(guess3);
        guess.addSlot(guess4);
  
        //takes user guesses while making sure the guesses are the correct type
        guess.generateGuess(guess.guess);
        
        System.out.println("");
        
        //prints user guesses
        for(GuessSlot guessSlot : guess.guess){
          System.out.print(guessSlot.getDigit()+" ");
        }
          
        //constructs FeedbackSlot objects
        FeedbackSlot feedback1 = new FeedbackSlot(' ');
        FeedbackSlot feedback2 = new FeedbackSlot(' ');
        FeedbackSlot feedback3 = new FeedbackSlot(' ');
        FeedbackSlot feedback4 = new FeedbackSlot(' ');
  
        //constructs feedback array list
        ArrayList<FeedbackSlot> feedbackArray = new ArrayList<FeedbackSlot>();
  
        //constructs Feedback object
        Feedback feedback = new Feedback(feedbackArray);
        
        //adding the feedbackSlot object to the Feedback object
        feedback.addSlot(feedback1);
        feedback.addSlot(feedback2);
        feedback.addSlot(feedback3);
        feedback.addSlot(feedback4);
  
        //compares the guess with the solution and gives feedback
        feedback.giveFeedback(guess.guess, solution.solution, feedback.feedback);
          
        System.out.println("");
        for(FeedbackSlot feedbackSlot : feedback.feedback){
          System.out.print(feedbackSlot.getChar()+" ");
        }
        System.out.println("");
  
        //checks if user has guessed the code
        if(feedback.feedback.get(0).getChar() == 'O' && feedback.feedback.get(1).getChar() == 'O' && feedback.feedback.get(2).getChar() == 'O' && feedback.feedback.get(3).getChar() == 'O'){
          win = true;
        }
      }
      //print "You win" message
      System.out.println("Congraduations! You win!");
    }
  }
