package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.enums.EnemyCategory;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private EnemyCategory category;

    private int distressPoints;
    private int darknessLevel;

    public Enemy() {}

    public Enemy(String name, String description, EnemyCategory category, int distressPoints, int darknessLevel) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.distressPoints = distressPoints;
        this.darknessLevel = darknessLevel;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnemyCategory getCategory() {
        return category;
    }

    public void setCategory(EnemyCategory category) {
        this.category = category;
    }

    public int getDistressPoints() {
        return distressPoints;
    }

    public void setDistressPoints(int distressPoints) {
        this.distressPoints = distressPoints;
    }

    public int getDarknessLevel() {
        return darknessLevel;
    }

    public void setDarknessLevel(int darknessLevel) {
        this.darknessLevel = darknessLevel;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", distressPoints=" + distressPoints +
                ", darknessLevel=" + darknessLevel +
                '}';
    }
}
