package upao.edu.pe.apiebook2.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upao.edu.pe.apiebook2.model.User;
import upao.edu.pe.apiebook2.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> addUser(@RequestParam String username,
                                        @RequestParam String password,
                                        @RequestParam String email){
        User user1 = userService.createUser(username,password,email);
        return ResponseEntity.ok(user1);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id,
                                               @RequestParam String username,
                                               @RequestParam String password,
                                               @RequestParam String email){
        User user1 = userService.updateUser(id,username,password,email);
        return ResponseEntity.ok(user1);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}