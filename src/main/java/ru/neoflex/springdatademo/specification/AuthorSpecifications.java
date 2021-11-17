package ru.neoflex.springdatademo.specification;

import org.springframework.data.jpa.domain.Specification;
import ru.neoflex.springdatademo.model.Author;

public final class AuthorSpecifications {

    public static Specification<Author> all() {
        return (root, q, cb) -> cb.isTrue(cb.literal(Boolean.TRUE));
    }

    public static Specification<Author> withName(String fullName) {
        return (root, q, cb) -> cb.equal(root.get("fullName"), fullName);
    }


}
