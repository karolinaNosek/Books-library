package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksApi {

    private Library library;

    @Autowired
    public BooksApi(Library library) {
        this.library = library;

    }

    @GetMapping("/showBooks")
    public List<Books> showBooks() {
        return library.getBooksList();
    }

}
