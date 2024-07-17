package laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User QuangHuy);

    User deleteById(long id);

    // List<User> findByEmail(String email);

    List<User> findAll();

    User findAllById(long id);

    boolean existsByEmail(String email);

    User findByEmail(String email);
    
}
