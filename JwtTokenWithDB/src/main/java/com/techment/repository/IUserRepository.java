package com.techment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
// Integer is Primary key only thats'why we give Integer
	
	
	Optional<User> findByUsernameAndPassword(String username,String password);
	
}
