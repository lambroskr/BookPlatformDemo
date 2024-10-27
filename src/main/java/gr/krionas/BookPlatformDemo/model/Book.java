package gr.krionas.BookPlatformDemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;

/**
 * Entity class representing a Book in the system.
 * Uses Lombok to generate getters, setters, and other utility methods.
 */
@Data
@Entity
public class Book {
    // Primary key for the Book entity, auto-generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private String genre;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date publishedDate;

}
