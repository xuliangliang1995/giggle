package com.grasswort.giggle.webflux.service;

import com.grasswort.giggle.webflux.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
public interface IBookService {

    Mono<Book> selectById(Long id);

    Flux<Book> selectAll();
}
