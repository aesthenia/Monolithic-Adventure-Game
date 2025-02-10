package enemies;

import player.Player;

public class Vampire implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(25);
    }
    @Override
    public int getExperienceReward() {
        return 50;
    }
}
