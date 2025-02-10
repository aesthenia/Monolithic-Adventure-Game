package items;

import player.Player;

public class HealthElixir implements Item {
    public void use(Player player) {
        player.takeDamage(-20);
    }
}
