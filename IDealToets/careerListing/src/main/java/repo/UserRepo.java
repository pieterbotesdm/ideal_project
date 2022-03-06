package repo;
//Importing modules 
import modules.Users;
import modules.Listings;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<Users, Integer> {
//
}
