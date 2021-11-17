package ru.neoflex.springdatademo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AuthorBookKey implements Serializable {

    @Column(name = "id_author")
    int authorId;

    @Column(name = "id_book")
    int bookId;
}
