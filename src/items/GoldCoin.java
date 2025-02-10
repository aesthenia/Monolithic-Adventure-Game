package items;

import player.Player;

public class GoldCoin implements Item {
    public void use(Player player) {
        player.gainExperience(5);
    }
}
