package ch.zhaw.iwi.devops.RSP;

public class RockPaperScissors {
    public String play(String player1, String player2) {
        if (!isValidInput(player1) || !isValidInput(player2)) return "Invalid input!";
        
        if (player1.equals(player2)) return "Draw!";
        
        if (player1.equals("rock") && player2.equals("scissors")) return "Player 1 wins!";
        if (player1.equals("scissors") && player2.equals("paper")) return "Player 1 wins!";
        if (player1.equals("paper") && player2.equals("rock")) return "Player 1 wins!";
        
        return "Player 2 wins!";
    }

    private boolean isValidInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }
}