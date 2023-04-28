package upao.edu.pe.apiebook2.service;

import upao.edu.pe.apiebook2.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();
}
