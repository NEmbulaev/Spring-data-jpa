package ru.neoflex.springdatademo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "authors")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private int idAuthor;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @OneToMany(mappedBy = "author")
    Set<AuthorBook> authorBooks;

    public Author(String fullName) {
        this.fullName = fullName;
    }
}


