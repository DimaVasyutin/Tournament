import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game = new Game();
    Player player1 = new Player(1, "Player1", 10);
    Player player2 = new Player(2, "Player2", 20);
    Player player3 = new Player(4, "Player3", 10);


    @Test
    public void testGameFirstStrongerSecond() {
        game.register(player1);
        game.register(player2);

        int actual = game.round("Player2", "Player1");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGameSecondStrongerFirst() {
        game.register(player1);
        game.register(player2);

        int actual = game.round("Player1", "Player2");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGameDraw() {
        game.register(player1);
        game.register(player3);

        int actual = game.round("Player1", "Player3");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGameBothPlayersNotFound() {
        game.register(player1);
        game.register(player3);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Player5", "Player6");
        });

    }

    @Test
    public void testGamePlayer1NotFound() {
        game.register(player1);
        game.register(player3);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Player5", "Player1");
        });

    }

    @Test
    public void testGamePlayer2NotFound() {
        game.register(player1);
        game.register(player3);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Player3", "Player5");
        });

    }

}
