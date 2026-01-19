package dev.app.mahoShojo_boot.repository;

import dev.app.mahoShojo_boot.model.MahoShojoUsers;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<MahoShojoUsers, String> {
}
