package gamebox;

import java.util.ArrayList;
import java.util.List;

class User {
    private List<Game> ownedGames = new ArrayList<>();

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to your library");
    }

    public void showOwnedGames() {
        System.out.println("Owned Games:");
        for (Game game : ownedGames) {
            System.out.println("- " + game.getTitle());
        }
    }
}
