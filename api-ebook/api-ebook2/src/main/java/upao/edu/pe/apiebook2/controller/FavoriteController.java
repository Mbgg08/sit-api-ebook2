package upao.edu.pe.apiebook2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upao.edu.pe.apiebook2.model.FavoriteBook;
import upao.edu.pe.apiebook2.service.FavoriteService;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController {
    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService){
        this.favoriteService = favoriteService;
    }

    @PostMapping
    public ResponseEntity<FavoriteBook> addFavorite(@RequestParam Long bookId,
                                                    @RequestParam Long userId){
        FavoriteBook favoriteBook1 = favoriteService.createFavorite(bookId,userId);
        return ResponseEntity.ok(favoriteBook1);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFavorite(@PathVariable Long id){
        favoriteService.deleteFavoriteBook(id);
    }


}