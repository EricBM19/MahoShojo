package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.enums.DarkArtType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class DarkArt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Enumerated(EnumType.STRING)
    private DarkArtType type;

    @OneToMany(mappedBy = "darkArt")
    private List<EnemyDarkArt> enemies = new ArrayList<>();

    public DarkArt() {}

    public DarkArt(String title, DarkArtType type) {
        this.title = title;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DarkArtType getType() {
        return type;
    }

    public void setType(DarkArtType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DarkArt{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}