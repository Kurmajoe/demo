package ch.zhaw.iwi.devops.RSP;

public class RockPaperScissors {
    public String play(String player1, String player2) {
        if (player1.equals("rock") && player2.equals("scissors")) return "Player 1 wins!";
        if (player1.equals("scissors") && player2.equals("paper")) return "Player 1 wins!";
        if (player1.equals("paper") && player2.equals("rock")) return "Player 1 wins!";
        
        if (player2.equals("rock") && player1.equals("scissors")) return "Player 2 wins!";
        if (player2.equals("scissors") && player1.equals("paper")) return "Player 2 wins!";
        if (player2.equals("paper") && player1.equals("rock")) return "Player 2 wins!";
        
        return "Invalid!";
    }
}