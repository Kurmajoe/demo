package ch.zhaw.iwi.devops.RPS;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.RSP.RockPaperScissors;

public class RockPaperScissorsTest {

    @Test
    public void testRockBeatsScissors() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 1 wins!", game.play("rock", "scissors"));
    }

    @Test
    public void testScissorsBeatsPaper() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 1 wins!", game.play("scissors", "paper"));
    }

    @Test
    public void testPaperBeatsRock() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 1 wins!", game.play("paper", "rock"));
    }

    @Test
    public void testScissorsLosesToRock() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 2 wins!", game.play("scissors", "rock"));
    }

    @Test
    public void testPaperLosesToScissors() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 2 wins!", game.play("paper", "scissors"));
    }

    @Test
    public void testRockLosesToPaper() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Player 2 wins!", game.play("rock", "paper"));
    }

    @Test
    public void testSameChoiceResultsInDraw() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Draw!", game.play("rock", "rock"));
        assertEquals("Draw!", game.play("paper", "paper"));
        assertEquals("Draw!", game.play("scissors", "scissors"));
    }

    @Test
    public void testInvalidInputPlayer1() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Invalid input!", game.play("invalid", "rock"));
    }

    @Test
    public void testInvalidInputPlayer2() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Invalid input!", game.play("rock", "invalid"));
    }

    @Test
    public void testInvalidInputBothPlayers() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Invalid input!", game.play("invalid", "invalid"));
    }
}