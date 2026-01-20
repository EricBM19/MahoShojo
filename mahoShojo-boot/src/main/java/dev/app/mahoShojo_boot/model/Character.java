package dev.app.mahoShojo_boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

public class Character {

    private String id;
    private String name;
    private String mahoShojoClass;
    private int combativa;
    private int protectora;
    private int reflexiva;
    private int emocional;
    private int entregada;
    private List<String> minorAdvances;
    private List<String> majorAdvances;
    private List<String> advanceMovements;
}
