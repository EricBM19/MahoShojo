package dev.app.mahoShojo_boot.model;

import dev.app.mahoShojo_boot.utils.IdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MahoShojoUsers {

    @Id
    private String id;
    private String name;
    private String username;
    private String password;
    private String email;

    public MahoShojoUsers() {}

    public MahoShojoUsers(String name, String username, String password, String email) {
        this.id = IdGenerator.generateUserId();
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
