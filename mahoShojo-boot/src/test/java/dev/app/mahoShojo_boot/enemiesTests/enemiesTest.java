package dev.app.mahoShojo_boot.enemiesTests;

import dev.app.mahoShojo_boot.enums.EnemyCategory;
import dev.app.mahoShojo_boot.model.Enemy;
import dev.app.mahoShojo_boot.repository.EnemiesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class enemiesTest {

    @Test
    void createEnemy() {
        Enemy enemy = new Enemy();
        enemy.setName("Dementor");
        enemy.setDescription("Espectro de oscuridad que arrebata la energia vital a las personas.");
        enemy.setCategory(EnemyCategory.MUÑECA);
        enemy.setDistressPoints(8);
        enemy.setDarknessLevel(2);

        System.out.println(enemy);
    }
}
