package gr.krionas.BookPlatformDemo.service;

import gr.krionas.BookPlatformDemo.model.Book;
import gr.krionas.BookPlatformDemo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo repo;

    public List<Book> getAllBooks() {
        return repo.findAll();

    }
}
