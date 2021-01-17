package com.grasswort.grasswortshardjdbc.mapper;

import com.grasswort.grasswortshardjdbc.domain.Library;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryDao {
    int deleteByPrimaryKey(Long id);

    int insert(Library record);

    int insertSelective(Library record);

    Library selectByPrimaryKey(Long id);

    List<Library> listLibraries();

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}