package com.javatpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    private int id;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private String bookClass;

    public Book() {
        super();
        this.bookName="";
        this.bookAuthor="";
        this.bookClass="";
        this.bookPrice = 0;
        this.id = 0;
    }

    public Book(int id, String bookName, String bookAuthor, int bookPrice, String bookClass) {
        super();
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookClass = bookClass;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

}
