package entity.t.example.Entity.Repository;

import entity.t.example.Entity.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository <Product, Long> {



}

