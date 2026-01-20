package dev.app.mahoShojo_boot.enemiesTests;

import dev.app.mahoShojo_boot.model.Enemy;
import dev.app.mahoShojo_boot.repository.EnemiesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class enemiesTest {

    @Autowired
    EnemiesRepository enemiesRepository;

    @Test
    void createEnemy () {
        String name = "Dementor";
        String category = "Muñeca";
        int distressPoints = 2;
        int darknessLevel = 8;

        String darkArt1 = "Moverse entre las sombras";
        String darkArt2 = "(Semilla)1[Absorber felicidad]";

        List<String> darkArts = new ArrayList<>();
        darkArts.add(darkArt1);
        darkArts.add(darkArt2);

        Enemy enemy = new Enemy(name, category, distressPoints, darknessLevel, darkArts);
        System.out.println(enemy);
    }

    @Test
    void createAndSaveEnemyAtDB () {

        String name = "Dementor";
        String category = "Muñeca";
        int distressPoints = 2;
        int darknessLevel = 8;

        String darkArt1 = "Moverse entre las sombras";
        String darkArt2 = "(Semilla)1[Absorber felicidad]";

        List<String> darkArts = new ArrayList<>();
        darkArts.add(darkArt1);
        darkArts.add(darkArt2);

        Enemy enemy = new Enemy(name, category, distressPoints, darknessLevel, darkArts);
        enemiesRepository.save(enemy);
        System.out.println(enemiesRepository.findById(enemy.getId()));

    }
}
