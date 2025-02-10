package enemies;

import player.Player;

public class Zombie implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(15);
    }
    @Override
    public int getExperienceReward() {
        return 30;
    }
}
