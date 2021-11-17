package ru.neoflex.springdatademo.specification;

import org.springframework.data.jpa.domain.Specification;
import ru.neoflex.springdatademo.model.Book;

public final class BookSpecifications {

    public static Specification<Book> all() {
        return (root, q, cb) -> cb.isTrue(cb.literal(Boolean.TRUE));
    }

    public static Specification<Book> withTitle(String title) {
        return (root, q, cb) -> cb.equal(root.get("title"), title);
    }


}

