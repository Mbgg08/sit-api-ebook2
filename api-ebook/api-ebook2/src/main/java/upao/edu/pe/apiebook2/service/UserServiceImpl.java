package upao.edu.pe.apiebook2.service;


import org.springframework.stereotype.Service;
import upao.edu.pe.apiebook2.model.User;
import upao.edu.pe.apiebook2.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User createUser(String username, String password, String email) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, String username, String password, String email) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}