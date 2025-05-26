package ma.enset.bdcc.benhima.ebank.repositories;

import ma.enset.bdcc.benhima.ebank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}