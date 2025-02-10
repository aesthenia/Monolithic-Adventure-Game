package combat;

import player.*;
import enemies.*;

public class Combat {
    public static void engage(Player player, Enemy enemy) {
        enemy.attack(player);
        player.gainExperience(enemy.getExperienceReward());
    }
}
