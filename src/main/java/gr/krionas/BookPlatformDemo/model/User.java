package gr.krionas.BookPlatformDemo.model;

import jakarta.persistence.*;
import lombok.Data;

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
