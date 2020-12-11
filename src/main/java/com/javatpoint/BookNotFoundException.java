package com.javatpoint;

public class BookNotFoundException extends Exception{
    private int book_id;
    public BookNotFoundException(int book_id) {
        super(String.format("Book is not found with id: '%s'", book_id));
    }
}
