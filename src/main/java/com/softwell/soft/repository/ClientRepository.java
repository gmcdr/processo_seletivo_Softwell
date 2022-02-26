package com.softwell.soft.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softwell.soft.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
			
			@Query(value = "SELECT i FROM Client  i  WHERE i.email = :email",  nativeQuery=true)
			public  Client findByEmail(String email);
	
}
