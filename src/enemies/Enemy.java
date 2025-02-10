package enemies;

import player.Player;


public interface Enemy {
    void attack(Player player);
    int getExperienceReward();
}
