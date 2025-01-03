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

    public Book saveBook(Book book){
        return repo.save(book);
    }

    public void updateBook(Long id, Book updatedBook){
        Book book = repo.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
        book.setAuthor(updatedBook.getAuthor());
        book.setTitle(updatedBook.getTitle());

        repo.save(book);
    }

    public void deleteBook(Long id){
        repo.deleteById(id);;
    }
    
}
