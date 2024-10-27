package gr.krionas.BookPlatformDemo.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entity class representing a User in the system.
 * Uses Lombok to generate getters, setters, and other utility methods.
 */
@Data
@Entity
@Table(name="users")
public class User {
    @Id
    private String username;
    private String email;
    private String password;
    private String role;
}
