package ru.neoflex.springdatademo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.springdatademo.model.Author;
import ru.neoflex.springdatademo.model.Book;
import ru.neoflex.springdatademo.service.AuthorService;
import ru.neoflex.springdatademo.service.BookService;

import java.util.List;

@SpringBootTest
public class JpaAuthorRepositoryTests extends TestEnvironmentInit{

    @Autowired
    private AuthorService authorService;
    @Autowired
    private AuthorService authorServiceService;
    @Autowired
    private BookService bookService;



    @Test
    public void findAllAuthorsTest() {
        List<Author> authors = authorService.findAll();
        assertTrue(authors.size() > 0);
    }




}
