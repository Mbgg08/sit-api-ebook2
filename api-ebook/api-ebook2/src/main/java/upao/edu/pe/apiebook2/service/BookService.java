package upao.edu.pe.apiebook2.service;

import org.springframework.web.multipart.MultipartFile;
import upao.edu.pe.apiebook2.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(String title, String author, String description, MultipartFile image);

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book updateBook(Long id,String title, String author, String description, MultipartFile image);

    void deleteBook(Long id);
}
