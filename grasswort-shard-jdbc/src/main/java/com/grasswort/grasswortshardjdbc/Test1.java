package com.grasswort.grasswortshardjdbc;

import com.grasswort.grasswortshardjdbc.domain.Book;
import com.grasswort.grasswortshardjdbc.dto.BookDTO;
import com.grasswort.grasswortshardjdbc.mapper.BookDao;
import com.grasswort.grasswortshardjdbc.service.BookService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Test1 {

    private final BookService bookService;

    private final BookDao bookDao;

    public Test1(BookService bookService, BookDao bookDao) {
        this.bookService = bookService;
        this.bookDao = bookDao;
    }

    @PostConstruct
    public void test() {
        //HintManager hintManager = HintManager.getInstance();
        //hintManager.addDatabaseShardingValue("book", "shard1");
        // hintManager.addTableShardingValue("book", 1);
//        bookService.addBook(1,"Thinking in Java");
//        bookService.addBook(2,"Thinking in SpringBoot");
//        List<Book> booksOfLib1 = bookService.listBooksOfLibrary(1);
//        for (Book book : booksOfLib1) {
//            System.out.println(book.getName());
//            book.setName(book.getName().concat(".bak"));
//            bookService.updateBook(book);
//        }

        for (int i = 0; i < 5; i++) {
            List<BookDTO> bookDTOSOfLib2 = bookDao.listBookDTOsOfLibrary(2);
        }
//        for (BookDTO bookDTO : bookDTOSOfLib2) {
//            System.out.println(bookDTO.getName() + " from " + bookDTO.getLibrary());
//        }
    }
}
