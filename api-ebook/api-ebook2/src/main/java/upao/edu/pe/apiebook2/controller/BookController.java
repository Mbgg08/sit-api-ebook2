package upao.edu.pe.apiebook2.controller;

import jakarta.persistence.Entity;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import upao.edu.pe.apiebook2.model.Book;
import upao.edu.pe.apiebook2.service.BookService;

import java.util.List;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        return new ResponseEntity<List<Book>>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestParam String title, @RequestParam String author, @RequestParam String description, @RequestParam MultipartFile image){
        Book book1 = bookService.createBook(title,author,description,image);
        return ResponseEntity.ok(book1);
    }
}
