import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<Player>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {
            if (player.getName() == playerName1) {
                player1 = player;
            }

            if (player.getName() == playerName2) {
                player2 = player;
            }
        }

        if (player1 == null && player2 == null) {
            throw new NotRegisteredException(
                    "Оба игрока не найден"
            );
        }

        if (player1 == null) {
            throw new NotRegisteredException(
                    "Игрок 1 не найден"
            );
        }

        if (player2 == null) {
            throw new NotRegisteredException(
                    "Игрок 2 не найден"
            );
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }

        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;
    }
}
