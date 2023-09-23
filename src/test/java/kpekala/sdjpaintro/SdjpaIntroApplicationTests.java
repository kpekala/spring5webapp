package kpekala.sdjpaintro;

import kpekala.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void contextLoads() {
		long count = bookRepository.count();

		assertThat(count).isGreaterThan(0);
	}

}
