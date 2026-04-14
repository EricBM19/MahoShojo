package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.enums.DarkArtType;
import jakarta.persistence.*;

@Entity
public class DarkArt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private DarkArtType type;

    public DarkArt() {}

    public DarkArt(String title, String description, DarkArtType type) {
        this.title = title;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}