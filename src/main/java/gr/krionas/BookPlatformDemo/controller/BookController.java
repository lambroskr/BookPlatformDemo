package gr.krionas.BookPlatformDemo.controller;

import gr.krionas.BookPlatformDemo.model.Book;
import gr.krionas.BookPlatformDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

}
