package gr.krionas.BookPlatformDemo.service;

import gr.krionas.BookPlatformDemo.model.Book;
import gr.krionas.BookPlatformDemo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepo repo;

    public List<Book> getAllBooks() {
        return repo.findAll();

    }

    public Optional<Book> getBookById(int id) {
        return repo.findById(id);
    }

    public Book getBookByTitle(String title) {
        return repo.findByTitle(title);
    }

    public List<Book> getBookByAuthor(String author) {
        return repo.findByAuthor(author);
    }

    public void addBook(Book book) {
        repo.save(book);
    }
}
