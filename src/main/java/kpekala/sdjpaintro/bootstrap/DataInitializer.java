package kpekala.sdjpaintro.bootstrap;

import kpekala.sdjpaintro.domain.Book;
import kpekala.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Super book", "123", "Super publisher");

        System.out.println("Id: " + book1.getId());

        Book savedBook1 = bookRepository.save(book1);

        System.out.println("Id: " + savedBook1.getId());


        Book bookSIA = new Book("Spring in Action", "234234", "Orriely");
        Book savedBookSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId());
            System.out.println("Book title: " + book.getTitle());
        });

    }
}
