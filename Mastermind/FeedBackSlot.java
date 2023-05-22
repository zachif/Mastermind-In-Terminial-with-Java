package Mastermind;
class FeedbackSlot{

    //paramiter for feedback slot
    char feedback;
  
    //constructor for feedback slot
    public FeedbackSlot(char feedback){
      this.feedback = feedback;
    }
    
    //sets feedback to right number wrong place
    public void rNwP(){
      this.feedback = 'X';
    }
  
    //sets feedback to right number right place
    public void rNrP(){
      this.feedback = 'O';
    }
  
    //gets feedback character
    public char getChar(){
      return this.feedback;
    }
  }