package com.altun;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

	// Beispiele für customized Queries

	List<Product> findByBrand(String brand);

	@Query("from prodcuct where brand=?1 order by name")
	List<Product> findByBrandSorted(String brand);

}
