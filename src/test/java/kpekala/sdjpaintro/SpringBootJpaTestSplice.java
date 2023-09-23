package kpekala.sdjpaintro;

import kpekala.sdjpaintro.domain.Book;
import kpekala.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class SpringBootJpaTestSplice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long countBefore = bookRepository.count();

        bookRepository.save(new Book("My Book", "123123", "Self"));

        long countAfter = bookRepository.count();

        assertThat(countBefore).isEqualTo(countAfter - 1);
    }
}
