package dev.app.mahoShojo_boot.mahoShojoUsersTests;

import dev.app.mahoShojo_boot.model.MahoShojoUsers;
import dev.app.mahoShojo_boot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mahoShojoUserTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void userTest() {

        MahoShojoUsers mahoShojoUsers1 = new MahoShojoUsers("John", "JDoe", "12345", "jdoe@gmail.com");
        System.out.println(mahoShojoUsers1);
    }

    @Test
    void userTestDB() {
        MahoShojoUsers mahoShojoUsers1 = new MahoShojoUsers("John", "JDoe", "12345", "jdoe@gmail.com");
        userRepository.save(mahoShojoUsers1);
        System.out.println(userRepository.findById(mahoShojoUsers1.getId()));
    }
}
