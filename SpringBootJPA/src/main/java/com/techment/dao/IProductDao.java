package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Product;

@Repository    // for DAO
public interface IProductDao extends JpaRepository<Product,Integer> {

	
	
	// custom finding .. individually
	List<Product> findByName(String name);
	List<Product> findByCategory(String category);
	
	
	//custom fining ... more the one
	List<Product> findByNameAndCategory(String category, String name); // sequence of category and name doesnt matter
	// it is predefind thatswhy automatically runn in table sequence only
	
	

	
}
