package com.grasswort.giggle.webflux.service.impl;

import com.grasswort.giggle.webflux.dao.BookRepository;
import com.grasswort.giggle.webflux.model.Book;
import com.grasswort.giggle.webflux.service.IBookService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@Service
public class BookServiceImpl implements IBookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Mono<Book> selectById(Long id) {
        return Mono.justOrEmpty(bookRepository.selectById(id));
    }

    @Override
    public Flux<Book> selectAll() {
        return Flux.fromIterable(bookRepository.selectAll());
    }
}
