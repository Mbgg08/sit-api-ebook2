package upao.edu.pe.apiebook2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upao.edu.pe.apiebook2.model.FavoriteBook;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteBook,Long> {
}