package com.grasswort.grasswortshardjdbc.dto;

import com.grasswort.grasswortshardjdbc.domain.Book;

public class BookDTO extends Book {

    private String library;

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }
}
