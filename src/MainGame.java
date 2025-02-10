import player.*;
import enemies.*;
import items.*;
import level.*;
import combat.*;
import score.*;

import java.util.ArrayList;

public class MainGame {
    private Player player;
    private LevelManager levelManager;
    private Score score;

    public MainGame() {
        this.player = new Player("Adventurer");
        this.levelManager = new LevelManager();
        this.score = new Score();
    }

    public void play() {
        while (player.isAlive() && levelManager.getLevel() <= 3) {
            System.out.println("=== Level " + levelManager.getLevel() + " ===");


            if (!levelManager.getEnemies().isEmpty()) {
                System.out.println("Enemies encountered: ");
                for (Enemy enemy : levelManager.getEnemies()) {
                    System.out.println("- " + enemy.getClass().getSimpleName());
                }
            }


            for (Enemy enemy : new ArrayList<>(levelManager.getEnemies())) {
                System.out.println(player.getName() + " fights " + enemy.getClass().getSimpleName());
                Combat.engage(player, enemy);
                score.addPoints(enemy.getExperienceReward());
                levelManager.removeEnemy(enemy);
                System.out.println("Remaining Health: " + player.getHealth());
            }


            if (!levelManager.getItems().isEmpty()) {
                System.out.println("Items found: ");
                for (Item item : levelManager.getItems()) {
                    System.out.println("- " + item.getClass().getSimpleName());
                }
            }

            // Подбор предметов
            for (Item item : new ArrayList<>(levelManager.getItems())) {
                System.out.println(player.getName() + " picks up " + item.getClass().getSimpleName());
                item.use(player);
                levelManager.removeItem(item);
            }


            System.out.println("Current experience: " + player.getExperience());
            System.out.println("Current health: " + player.getHealth());


            if (player.isAlive() && levelManager.getLevel() < 3) {
                player.resetHealth();
                levelManager.advanceLevel();
                System.out.println("Advancing to next level...");
            } else {
                break;
            }
        }


        System.out.println(player.isAlive()
                ? "Congratulations! You completed the adventure with " + player.getExperience() + " experience points and a score of " + score.getTotalScore() + "!"
                : "Game Over. Final score: " + score.getTotalScore());
    }


    public static void main(String[] args) {
        MainGame game = new MainGame();
        game.play();
    }
}