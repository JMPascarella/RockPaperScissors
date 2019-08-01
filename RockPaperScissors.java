/**
 * RockPaperScissors
 */
//Author JMP
//Date: July 31, 2019 
//Description: Basic game of rock, paper and Scissors. User will choose from a number-based menu representing one of the three items. Computer will randomly select a number representing one of the three items. Game will determine the winner.  

import javax.swing.JOptionPane;
public class RockPaperScissors {

    public static void main(String[] args) {    
        
        //Variables and constants needed for this application
        int user;
        int comp;
        String userPick;
        String compPick;
        String message = null;

        //Input phase
        //User chooses a number representing an item
        user = Integer.parseInt(JOptionPane.showInputDialog(null, "A new challenger has appeared! \nPlease choose wisely: \n1--ROCK \n2--PAPER \n3--SCISSORS"));

        //Calculation Phase
        //Computer randomly chooses a number between 1 and 3
        comp = ((int)(Math.random() * 3) + 1);

        //Decision process which assigns a string with the name of the item based on the numeric selections
        //Player's string
        if (user == 1) {
            userPick = "Rock";    
        } else {
            if (user == 2) {
                userPick = "Paper";
            } else {
                userPick = "Scissors";
            }
        }
        //Computer's string
        if (comp == 1) {
            compPick = "Rock";
        } else {
            if (comp == 2) {
                compPick = "Paper";
            } else {
                compPick = "Scissors";
            }
        }
        //If else to determine the winner...
        if (userPick == compPick) {
            message = "You tied!";
        } else {
            if (userPick == "Rock" && compPick == "Scissors") {
                message = "You win!";
            } else {
                if (userPick == "Rock" && compPick == "Paper") {
                    message = "You lose!";
                } else {
                    if (userPick == "Paper" && compPick == "Rock") {
                        message = "You win!";
                    } else {
                        if (userPick == "Paper" && compPick == "Scissors") {
                            message = "You lose!";
                        } else {
                            if (userPick == "Scissors" && compPick == "Rock") {
                                message = "You lose!";
                            } else {
                                if (userPick == "Scissors" && compPick == "Paper") {
                                    message = "You win!";
                                }
                            }
                        }
                    }
                }
            }
        }

        //Output phase
        JOptionPane.showMessageDialog(null, "You chose: " + userPick + "\nYour opponent chose: " + compPick + ". \nOutcome: " + message);
    }
}
