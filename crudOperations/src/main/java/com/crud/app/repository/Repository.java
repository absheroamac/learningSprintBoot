package com.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.entity.Book;

public interface Repository extends JpaRepository<Book,Long>{

    
}
