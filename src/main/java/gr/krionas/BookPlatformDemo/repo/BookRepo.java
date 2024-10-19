package gr.krionas.BookPlatformDemo.repo;

import gr.krionas.BookPlatformDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

}
