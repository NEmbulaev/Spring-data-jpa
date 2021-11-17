package ru.neoflex.springdatademo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "authorsbooks")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorBook {

    @EmbeddedId
    private AuthorBookKey id;

    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(name = "id_author")
    Author author;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "id_book")
    Book book;



}


