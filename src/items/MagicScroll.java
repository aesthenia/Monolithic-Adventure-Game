package items;

import player.Player;

public class MagicScroll implements Item {
    public void use(Player player) {
        player.gainExperience(15);
    }
}
