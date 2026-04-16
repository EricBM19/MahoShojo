package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.enums.MahoShojoArchetype;
import jakarta.persistence.*;

import java.util.List;

public class MahoShojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @Enumerated(EnumType.STRING)
    private MahoShojoArchetype archetype;

    private int combativa;
    private int protectora;
    private int reflexiva;
    private int emocional;
    private int entregada;
}
