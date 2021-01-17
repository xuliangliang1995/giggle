package com.grasswort.grasswortshardjdbc.mapper;

import com.grasswort.grasswortshardjdbc.domain.Book;
import com.grasswort.grasswortshardjdbc.dto.BookDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    List<Book> listBooksOfLibrary(long libraryId);

    List<BookDTO> listBookDTOsOfLibrary(long libraryId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}