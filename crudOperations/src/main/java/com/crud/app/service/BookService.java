package com.crud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.entity.Book;
import com.crud.app.repository.Repository;

@Service
public class BookService {

    @Autowired
    private Repository repo;

    public List<Book> getAllBooks(){
        return repo.findAll();
    }

    public Book getBook(Long id){
        return repo.findById(id).orElse(null);
    }

    public void addBook(Book book){
        repo.save(book);
    }
    
}
