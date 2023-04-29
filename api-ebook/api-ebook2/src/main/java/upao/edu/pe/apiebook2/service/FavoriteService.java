package upao.edu.pe.apiebook2.service;

import org.springframework.stereotype.Service;
import upao.edu.pe.apiebook2.model.FavoriteBook;

@Service
public interface FavoriteService {
    FavoriteBook createFavorite(Long bookId, Long userId);
    void deleteFavoriteBook(Long id);
    FavoriteBook getFavoriteById(Long id);
}