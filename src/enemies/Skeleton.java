package enemies;

import player.Player;

public class Skeleton implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(10);
    }
    @Override
    public int getExperienceReward() {
        return 20;
    }
}

