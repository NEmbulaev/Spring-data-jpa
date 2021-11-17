package ru.neoflex.springdatademo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.springdatademo.model.Author;
import ru.neoflex.springdatademo.repository.AuthorRepository;
import ru.neoflex.springdatademo.specification.AuthorSpecifications;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author findById(Integer id) {
        return authorRepository
                .findById(id).orElseThrow(()-> new IllegalArgumentException("Cannot find author by ID - " + id));
    }
    @Transactional
    public List<Author> findAllWithName(String fullName) {
        return authorRepository.findAll(AuthorSpecifications.withName(fullName));
    }


    @Transactional
    public List<Author> findAll() {
        return authorRepository.findAll(AuthorSpecifications.all());
    }





}
