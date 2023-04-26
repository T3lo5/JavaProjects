package anderson.web.api.controller;

import anderson.web.api.model.User;
import anderson.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> getUsers(){
        return repository.listAll();
    }
    @PostMapping("/users")
    public void post(@RequestBody User user){
        repository.save(user);
    }
    @PutMapping("/users")
    public void put(@RequestBody User user){
        repository.update(user);
    }
    @GetMapping("/user/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/deleteuser/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
