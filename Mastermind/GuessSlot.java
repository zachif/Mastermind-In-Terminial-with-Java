package Mastermind;
class GuessSlot extends SolutionSlot{
    //The GuessSlot is a child class of the SolutionSlot as it will contain the same kind of information
    
    //constructor for GuessSlot
    public GuessSlot(int position, int digit){
      super(position, digit);
    }
  
    //setSlot methode for setting the digit peramiter in GuessSlot objects
    public void setSlot(int digit){
      this.digit=digit;
    }
  }