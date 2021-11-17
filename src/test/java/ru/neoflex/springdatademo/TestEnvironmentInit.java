package ru.neoflex.springdatademo;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import ru.neoflex.springdatademo.model.Author;
import ru.neoflex.springdatademo.model.AuthorBook;
import ru.neoflex.springdatademo.model.Book;
import ru.neoflex.springdatademo.repository.AuthorRepository;
import ru.neoflex.springdatademo.repository.AuthorsBooksRepository;
import ru.neoflex.springdatademo.repository.BookRepository;

abstract class TestEnvironmentInit {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    AuthorsBooksRepository authorsBooksRepository;


    @BeforeAll
    static void beforeAll(@Autowired AuthorRepository authorRepository,
                          @Autowired BookRepository bookRepository,
                          @Autowired AuthorsBooksRepository authorsBooksRepository) {

        /* Заполнение авторов */
        Author author11 = authorRepository.save(new Author("Джон Рональд Руэл Толкин"));
        Author author12 = authorRepository.save(new Author("Александр Дюма"));
        Author author13 = authorRepository.save(new Author("Берт Бейтс"));
        Author author14 = authorRepository.save(new Author("Кэти Сьерра"));

        /* Заполнение книг */
        Book book11 = bookRepository.save(new Book("Властелин Колец, часть первая", 1500));
        Book book12 = bookRepository.save(new Book("Три мушкетера", 2500));
        Book book13 = bookRepository.save(new Book("Изучаем JAVA", 1230));

       /* AuthorBook authorBook13 = authorsBooksRepository.save(new AuthorBook(1,1));
        AuthorBook authorBook14 = authorsBooksRepository.save(new AuthorBook(2,2));
        AuthorBook authorBook11 = authorsBooksRepository.save(new AuthorBook(3,3));
        AuthorBook authorBook12 = authorsBooksRepository.save(new AuthorBook(4,3));*/



        printTitle("Data - Generated");
    }

    @AfterAll
    public static void afterAll(@Autowired BookRepository bookRepository,
                                @Autowired AuthorRepository authorRepository,
                                @Autowired AuthorsBooksRepository authorsBooksRepository) {

        bookRepository.deleteAll();
        authorRepository.deleteAll();
        authorsBooksRepository.deleteAll();
    }


    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void printTitle(String s) {
        System.out.println("\n==========================");
        System.out.println(s);
        System.out.println("==========================");
    }
}
