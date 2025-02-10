package level;

import java.util.ArrayList;
import enemies.*;
import items.*;

public class LevelManager {
    private int level;
    private ArrayList<Enemy> enemies;
    private ArrayList<Item> items;

    public LevelManager() {
        this.level = 1;
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
        setupLevel();
    }

    private void setupLevel() {
        enemies.clear();
        items.clear();
        switch (level){
            case 1:
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                items.add(new GoldCoin());
                items.add(new HealthElixir());
                break;
            case 2:
                enemies.add(new Vampire());
                items.add(new MagicScroll());
                break;
            case 3:
                enemies.add(new Vampire());
                enemies.add(new Zombie());
                items.add(new HealthElixir());
                items.add(new GoldCoin());
                break;
        }
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void advanceLevel() {
        if (level < 3) {
            level++;
            setupLevel();
        }
    }

    public int getLevel() {
        return level;
    }
}
