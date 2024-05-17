package ch.zhaw.iwi.devops.RSP;

public class RockPaperScissors {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String INVALID_INPUT = "Invalid input!";
    private static final String DRAW = "Draw!";
    private static final String PLAYER1_WINS = "Player 1 wins!";
    private static final String PLAYER2_WINS = "Player 2 wins!";

    public String play(String player1, String player2) {
        if (!isValidInput(player1) || !isValidInput(player2)) return INVALID_INPUT;
        
        if (player1.equals(player2)) return DRAW;
        
        if ((player1.equals(ROCK) && player2.equals(SCISSORS)) ||
            (player1.equals(SCISSORS) && player2.equals(PAPER)) ||
            (player1.equals(PAPER) && player2.equals(ROCK))) {
            return PLAYER1_WINS;
        }
        
        return PLAYER2_WINS;
    }

    private boolean isValidInput(String input) {
        return input.equals(ROCK) || input.equals(PAPER) || input.equals(SCISSORS);
    }
}