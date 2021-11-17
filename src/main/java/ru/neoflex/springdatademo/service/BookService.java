package ru.neoflex.springdatademo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.springdatademo.model.Book;
import ru.neoflex.springdatademo.repository.BookRepository;
import ru.neoflex.springdatademo.specification.BookSpecifications;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Transactional
    public List<Book> findAll() {
        return bookRepository.findAll(BookSpecifications.all());
    }
    @Transactional
    public Book findById(Integer id) {
        return bookRepository
                .findById(id).orElseThrow(()-> new IllegalArgumentException("Cannot find book by ID - " + id));
    }
}
