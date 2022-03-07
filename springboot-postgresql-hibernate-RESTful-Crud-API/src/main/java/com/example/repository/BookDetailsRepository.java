package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.BookAvg;
import com.example.model.BookDetails;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookDetails, Long> {
	
}
