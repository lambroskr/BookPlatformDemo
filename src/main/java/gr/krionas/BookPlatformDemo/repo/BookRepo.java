package gr.krionas.BookPlatformDemo.repo;

import gr.krionas.BookPlatformDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Book entities, providing basic CRUD and custom query methods.
 * Extends JpaRepository to inherit methods for persistence operations.
 */
@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

    // Finds a book by its title.
    Book findByTitle(String title);

    // Finds all books by a specific author.
    List<Book> findByAuthor(String author);
}
