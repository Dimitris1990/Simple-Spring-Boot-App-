package tsosman.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tsosman.dao.UserRepo;
import tsosman.entities.User;
import tsosman.exceptions.ResourceNotFoundException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserRepo userRepo;
    
    //Endpoint for a list with all the users
    @GetMapping
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    
    //Endpoint for creating a new entry
    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }
    
    //Endpoint for updating an already existing entry
    @PutMapping("/{id}")
    public User editUser(@PathVariable(value = "id")Integer userId, @RequestBody User updatedUser){
        Optional<User> optionalUser = userRepo.findById(userId);
        User selectedUser = optionalUser.orElseThrow(() -> new ResourceNotFoundException("User with id: " + userId + " doen't exist"));
        selectedUser.setName(updatedUser.getName());
        selectedUser.setEmail(updatedUser.getEmail());
        selectedUser.setCompany(updatedUser.getCompany());
        return userRepo.save(selectedUser);
    }
    
    // Endpoint to delete an entry
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable(value = "id") Integer userId){
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User with id: " + userId + " doen't exist"));
        userRepo.deleteById(userId);
        return ResponseEntity.ok("User with id: "+userId+" was deleted");
    }
    
    @GetMapping("/{company}")
    public List<User> usersByCompany(@PathVariable(value = "company")String company){
        List<User> userList = userRepo.findByCompany(company);
        return userList;
    }
    
}
