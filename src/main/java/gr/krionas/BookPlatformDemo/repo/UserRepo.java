package gr.krionas.BookPlatformDemo.repo;

import gr.krionas.BookPlatformDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for User entities, providing basic CRUD and custom query methods.
 * Extends JpaRepository to inherit methods for persistence operations.
 */
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);

}
