package dev.app.mahoShojo_boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private int distressPoints;
    private int darknessLevel;

    public Enemy() {}

    public Enemy(String name, String category, int distressPoints, int darknessLevel, List<String> darkArts) {
        this.name = name;
        this.category = category;
        this.distressPoints = distressPoints;
        this.darknessLevel = darknessLevel;
    }
}
