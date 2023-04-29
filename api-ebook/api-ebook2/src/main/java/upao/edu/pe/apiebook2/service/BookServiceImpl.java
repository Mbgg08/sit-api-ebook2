package upao.edu.pe.apiebook2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import upao.edu.pe.apiebook2.model.Book;
import upao.edu.pe.apiebook2.repository.BookRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(String title, String author, String description, MultipartFile image) {
        Book book = new Book(title,author,description,"", LocalDateTime.now(), LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public Book updateBook(Long id, String title, String author, String description, MultipartFile image) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}