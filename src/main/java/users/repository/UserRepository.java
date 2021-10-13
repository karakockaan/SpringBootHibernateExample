package users.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import users.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
