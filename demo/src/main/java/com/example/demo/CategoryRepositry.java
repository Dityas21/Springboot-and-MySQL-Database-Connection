package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CategoryRepositry extends JpaRepository<Category, Integer> {
    List<Category> findAll();
}
