package Mastermind;
import java.util.*;
class Solution {

  //constuctor for solution
  public Solution(ArrayList<SolutionSlot> solution){
    this.solution = solution;
  }

  //generating array for solution slots
  public ArrayList<SolutionSlot> solution = new ArrayList<SolutionSlot>();


  //this method puts the solution slots into the array
  public void addSlot(SolutionSlot solutionSlot){
    this.solution.add(solutionSlot);
  }

  //this mess right here goes through the SolutionSlot objects in the Solution and give the digit paramiter values
  public void generateSolution (ArrayList<SolutionSlot> solution){
    //this is a loop that cycles through the Solutin oject array
    for(SolutionSlot solutionSlot : solution){
      //The four switch state checks which SolutionSlot is active based on the position paramiter

      
      switch(solutionSlot.getPosition()){
        case 1:solutionSlot.setSlot();
          break;
        //The three while loops will keep generating a random digit between 0 and 9 until the digit in the slot is unique
        case 2: solutionSlot.setSlot();
        while(solutionSlot.getDigit() == solution.get(0).getDigit() || 
        solutionSlot.getDigit() == solution.get(2).getDigit() || 
        solutionSlot.getDigit() == solution.get(3).getDigit()){
          solutionSlot.setSlot();
        }
          break;
        case 3: solutionSlot.setSlot();
        while(solutionSlot.getDigit() == solution.get(0).getDigit() || 
        solutionSlot.getDigit() == solution.get(1).getDigit() || 
        solutionSlot.getDigit() == solution.get(3).getDigit()){
          solutionSlot.setSlot();
        }
          break;
        case 4: solutionSlot.setSlot();
        while(solutionSlot.getDigit() == solution.get(0).getDigit() || 
        solutionSlot.getDigit() == solution.get(1).getDigit() ||
        solutionSlot.getDigit() == solution.get(2).getDigit()){
          solutionSlot.setSlot();
        }
          break;
      
      }
      
    }
  }
}