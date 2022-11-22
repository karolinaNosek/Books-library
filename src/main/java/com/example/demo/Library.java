package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private List<Books> booksList;


    public Library() {
        this.booksList = new ArrayList<>();
        booksList.add(new Books("R.Mroz", "Hashtag"));
        booksList.add(new Books("M.Kunczewiczowa", "Cudzoziemka"));
        booksList.add(new Books("T.Marshall", "Wiezniowie geografii"));
        booksList.add(new Books("J.Nesbo", "Politi"));
    }
    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }
}
