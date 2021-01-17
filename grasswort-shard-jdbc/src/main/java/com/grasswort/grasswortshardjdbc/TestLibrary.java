package com.grasswort.grasswortshardjdbc;

import com.grasswort.grasswortshardjdbc.domain.Library;
import com.grasswort.grasswortshardjdbc.mapper.LibraryDao;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.util.List;

@Component
public class TestLibrary {

    private final LibraryDao libraryDao;

    public TestLibrary(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    //@PostConstruct
    public void test() {
//        Instant now = Instant.now();
//        Library library1 = new Library();
//        library1.setId(1L);
//        library1.setName("library_001");
//        library1.setGmtCreate(now);
//        library1.setGmtModified(now);
//        libraryDao.insert(library1);
//
//        Library library2 = new Library();
//        library2.setId(2L);
//        library2.setName("library_002");
//        library2.setGmtCreate(now);
//        library2.setGmtModified(now);
//        libraryDao.insert(library2);

        List<Library> libraries = libraryDao.listLibraries();
        for (Library library : libraries) {
            System.out.println(library.getName());
        }
    }
}
