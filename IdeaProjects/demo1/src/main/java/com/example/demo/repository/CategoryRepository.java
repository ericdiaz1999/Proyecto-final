package com.example.demo.repository;

import com.example.demo.models.Book;
import com.example.demo.models.Catregory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Catregory, Long> {
}
