package dev.app.mahoShojo_boot.repository;

import dev.app.mahoShojo_boot.model.Enemy;
import org.springframework.data.repository.CrudRepository;

public interface EnemiesRepository extends CrudRepository<Enemy, String> {
}
