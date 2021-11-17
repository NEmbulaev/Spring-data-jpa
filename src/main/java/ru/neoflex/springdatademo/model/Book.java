package ru.neoflex.springdatademo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int idBook;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private int price;


    @OneToMany(mappedBy = "book")
    Set<AuthorBook> authorBooks;

    public Book(String title, int price ) {
        this.price = price;
        this.title = title;
    }
}
