package gr.krionas.BookPlatformDemo.controller;

import gr.krionas.BookPlatformDemo.model.Book;
import gr.krionas.BookPlatformDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/book/id/{id}")
    public Optional<Book> getBookById(@PathVariable int id){
        return service.getBookById(id);
    }

    @GetMapping("/book/title/{title}")
    public Book getBookByTitle(@PathVariable String title){
        return service.getBookByTitle(title);
    }

    @GetMapping("/book/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
        return service.getBookByAuthor(author);
    }



}
