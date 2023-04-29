package upao.edu.pe.apiebook2.service;


import upao.edu.pe.apiebook2.model.User;

import java.util.List;
import upao.edu.pe.apiebook2.model.User;
public interface UserService {
    User createUser(User user);
    User createUser(String username, String password, String email);
    List<User> getAllUser();
    User getUserById(Long id);
    User getUserByUsername(String username);
    User updateUser(Long id, User user);
    //User getUserByUsername(String username);
    User updateUser(Long id, String username, String password, String email);
    void deleteUser(Long id);

}