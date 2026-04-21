package dev.app.mahoShojo_boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class EnemyDarkArt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "enemy_id", nullable = false)
    @JsonIgnore
    private Enemy enemy;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "dark_art_id", nullable = false)
    private DarkArt darkArt;

    private int powerLevel;
    private String customDescription;

    public EnemyDarkArt() {
    }

    public EnemyDarkArt(Enemy enemy, DarkArt darkArt, int powerLevel, String customDescription) {
        this.enemy = enemy;
        this.darkArt = darkArt;
        this.powerLevel = powerLevel;
        this.customDescription = customDescription;
    }

    public Long getId() {
        return id;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public DarkArt getDarkArt() {
        return darkArt;
    }

    public void setDarkArt(DarkArt darkArt) {
        this.darkArt = darkArt;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getCustomDescription() {
        return customDescription;
    }

    public void setCustomDescription(String customDescription) {
        this.customDescription = customDescription;
    }

    @Override
    public String toString() {
        return "EnemyDarkArt{" +
                "id=" + id +
                ", enemy=" + enemy +
                ", darkArt=" + darkArt +
                ", powerLevel=" + powerLevel +
                ", customDescription='" + customDescription + '\'' +
                '}';
    }
}
