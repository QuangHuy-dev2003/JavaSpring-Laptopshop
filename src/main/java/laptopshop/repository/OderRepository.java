package laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import laptopshop.domain.Order;
import laptopshop.domain.User;

@Repository
public interface OderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
