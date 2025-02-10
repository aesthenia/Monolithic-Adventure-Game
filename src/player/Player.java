package player;

import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private int experience;
    private ArrayList<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void gainExperience(int exp) {
        experience += exp;
    }

    public void pickUpItem(String item) {
        inventory.add(item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void resetHealth() {
        health = 100;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return String.valueOf(health);
    }
}
