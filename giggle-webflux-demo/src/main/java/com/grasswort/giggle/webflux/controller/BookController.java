package com.grasswort.giggle.webflux.controller;

import com.grasswort.giggle.webflux.model.Book;
import com.grasswort.giggle.webflux.service.IBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@RestController
@RequestMapping("books")
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("{bookId}")
    public Mono<Book> selectById(@PathVariable("bookId") Long id) {
        return bookService.selectById(id);
    }

    @GetMapping
    public Flux<Book> selectAll() {
        return bookService.selectAll();
    }
}
