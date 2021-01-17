package com.grasswort.grasswortshardjdbc.service;

import com.grasswort.grasswortshardjdbc.domain.Book;
import com.grasswort.grasswortshardjdbc.mapper.BookDao;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book selectById(long bookId) {
        return bookDao.selectByPrimaryKey(bookId);
    }


    public void addBook(long libraryId, String bookName) {
        Instant now = Instant.now();
        Book book = new Book();
        book.setLibId(libraryId);
        book.setName(bookName);
        book.setGmtCreate(now);
        book.setGmtModified(now);
        bookDao.insert(book);
    }

    public List<Book> listBooksOfLibrary(long libraryId) {
        return bookDao.listBooksOfLibrary(libraryId);
    }

    public void updateBook(Book book) {
        bookDao.updateByPrimaryKey(book);
    }
}
