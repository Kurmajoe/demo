package ch.zhaw.iwi.devops.RSP;

public class RockPaperScissors {
    public String play(String player1, String player2) {
        if (player1.equals("rock") && player2.equals("scissors")) return "Player 1 wins!";
        if (player1.equals("scissors") && player2.equals("paper")) return "Player 1 wins!";
        if (player1.equals("paper") && player2.equals("rock")) return "Player 1 wins!";
        
        return "Invalid!";
    }
}