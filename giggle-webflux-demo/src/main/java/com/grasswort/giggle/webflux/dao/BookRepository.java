package com.grasswort.giggle.webflux.dao;

import com.grasswort.giggle.webflux.model.Book;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@Repository
public class BookRepository {

    private final static List<Book> library = new LinkedList<>();

    static {
        library.add(new Book(1L, "Java 并发编程的艺术"));
        library.add(new Book(2L, "深入理解 Java 虚拟机"));
        library.add(new Book(3L, "SpringBoot 编程思想"));
    }

    /**
     * 根据 id 查询 {@link Book}
     * @param id
     * @return
     */
    public Book selectById(Long id) {
        return library.stream()
                .filter(b -> Objects.equals(id, b.getId()))
                .findFirst()
                .orElse(null);
    }

    /**
     * 全部 {@link Book}
     * @return
     */
    public List<Book> selectAll() {
        return library;
    }


}
