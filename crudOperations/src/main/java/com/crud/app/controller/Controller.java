package com.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.entity.Book;
import com.crud.app.service.BookService;

@RestController
@RequestMapping("/api/books")
public class Controller {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getBookById(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.saveBook(book));
    }
    
}
