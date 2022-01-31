package com.springstart.classes;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public void getBook(String bookName) {
        System.out.println("Мы берем книгу " + bookName);
    }

    public void getMagazine(String magazineName) {
        System.out.println("Мы берем magazine " + magazineName);
    }

    public void returnBook(String bookName) {
        System.out.println("return book " + bookName);
    }

    public void returnMagazine(String magazineName) {
        System.out.println("return magazine " + magazineName);
    }
}
