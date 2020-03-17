package com.roytuts.spring.boot.ajax.crud.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.roytuts.spring.boot.ajax.crud.entity.Company;


 
 
@Repository													 
public interface crudRepository extends JpaRepository<Company, Integer> 
{
	 
	
}