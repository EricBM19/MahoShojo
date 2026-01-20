package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.utils.IdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Enemy {

    @Id
    private String id;
    private String name;
    private String category;
    private int distressPoints;
    private int darknessLevel;
    private List<String> darkArts;

    public Enemy() {}

    public Enemy(String name, String category, int distressPoints, int darknessLevel, List<String> darkArts) {
        this.id = IdGenerator.generateEnemyId();
        this.name = name;
        this.category = category;
        this.distressPoints = distressPoints;
        this.darknessLevel = darknessLevel;
        this.darkArts = darkArts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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

    public List<String> getDarkArts() {
        return darkArts;
    }

    public void setDarkArts(List<String> darkArts) {
        this.darkArts = darkArts;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", distressPoints=" + distressPoints +
                ", darknessLevel=" + darknessLevel +
                ", darkArts=" + darkArts +
                '}';
    }
}
