package com.prospect.prospect.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prospect.prospect.model.Prospect;


@Repository
public interface ConRespo extends JpaRepository<Prospect, Integer>{
 
}
