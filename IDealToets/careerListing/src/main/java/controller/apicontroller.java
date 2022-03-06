package controller;

import modules.Users;
import modules.Listings;
import repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class apicontroller {
    @Autowired
    UserRepo UserRepo;

    @GetMapping("")//adding a mapping for an rest api
    public List<Listings> list() {
        return UserRepo.findAll();
    }//Getting the job listings from the database inserting them into a list aka array

    @GetMapping("/{id}")//using localhost:8080/id will allow a path with the website 
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try {
            Users user = UserRepo.getUser(id);//getting a user from his ID 
            return new ResponseEntity<Users>(user, HttpStatus.OK);//return value if found
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);//return value if not found
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Users user) {
    	UserRepo.save(user);//adding users
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Listings listings, Users user, @PathVariable Integer id) {
        try {
            Listings existUser = UserRepo.findById(id);
            user.setId(id);
            UserRepo.aplicants.save(user.id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }//updating saving listing adding a user into a column
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    	UserRepo.Delete(id);
    }//deleting the user 
}
