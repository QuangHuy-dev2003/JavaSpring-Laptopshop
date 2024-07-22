package laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import laptopshop.domain.Order_Detail;

@Repository
public interface OderDetailRepository extends JpaRepository<Order_Detail, Long> {
    
}
