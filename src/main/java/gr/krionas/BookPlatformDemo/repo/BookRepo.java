package gr.krionas.BookPlatformDemo.repo;

import gr.krionas.BookPlatformDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

    Book findByTitle(String title);

    List<Book> findByAuthor(String author);
}
