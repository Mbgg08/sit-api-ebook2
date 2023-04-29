package upao.edu.pe.apiebook2.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import upao.edu.pe.apiebook2.model.Book;
import upao.edu.pe.apiebook2.model.FavoriteBook;
import upao.edu.pe.apiebook2.model.User;
import upao.edu.pe.apiebook2.repository.BookRepository;
import upao.edu.pe.apiebook2.repository.FavoriteRepository;
import upao.edu.pe.apiebook2.repository.UserRepository;

import java.time.LocalDateTime;

@Service
public class FavoriteServiceImpl implements FavoriteService{

    private FavoriteRepository favoriteRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;

    public FavoriteServiceImpl(FavoriteRepository favoriteRepository, UserRepository userRepository, BookRepository bookRepository){
        this.favoriteRepository = favoriteRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }
    @Override
    public FavoriteBook createFavorite(Long bookId, Long userId) {
        Book book = bookRepository.findById(bookId).orElseThrow(()->new EntityNotFoundException(
                "Libro no encontrado"
        ));
        User user = userRepository.findById(userId).orElseThrow(()->new EntityNotFoundException(
                "Usuario no encontrado"
        ));
        FavoriteBook favoriteBook = new FavoriteBook(LocalDateTime.now(), LocalDateTime.now(),book,user);
        return favoriteRepository.save(favoriteBook);
    }

    @Override
    public void deleteFavoriteBook(Long id) {
        favoriteRepository.delete(getFavoriteById(id));
    }

    @Override
    public FavoriteBook getFavoriteById(Long id) {
        return favoriteRepository.findById(id).orElseThrow(()->new EntityNotFoundException(
                "La id no existe"
        ));
    }

}