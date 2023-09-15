package Player;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {
    private String name;
    private int health;
    private int damage;

    // tambem temos de criar uma var para a imagem?

    public Player(String name) {
        this.name = name;
        this.health = 100; // definir incrementar e decrementar
        this.gold = 0; // incrementar e decrementar
        this.damage = damage;

        /* range = incre
        health lost
         */

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // metodo health e damage (UPGRADES)
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void decreaseHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }

    }
/*
    public void draw() {
        player.draw(); */
    }

}
