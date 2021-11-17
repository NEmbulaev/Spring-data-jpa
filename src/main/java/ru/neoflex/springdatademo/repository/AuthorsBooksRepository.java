package ru.neoflex.springdatademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.neoflex.springdatademo.model.AuthorBook;


@Repository
public interface AuthorsBooksRepository extends JpaRepository<AuthorBook, Integer>, JpaSpecificationExecutor<AuthorBook> {


}


