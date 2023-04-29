package upao.edu.pe.apiebook2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import upao.edu.pe.apiebook2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}