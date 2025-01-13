package com.bookcommunity.bookcatalog.config;

import com.bookcommunity.bookcatalog.model.Book;
import com.bookcommunity.bookcatalog.model.Genre;
import com.bookcommunity.bookcatalog.repository.BookRepository;
import com.bookcommunity.bookcatalog.repository.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    public DataSeeder(BookRepository bookRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public void run(String... args) {
        bookRepository.deleteAll();
        genreRepository.deleteAll();

        Genre fiction = new Genre();
        fiction.setName("Fiction");

        Genre nonFiction = new Genre();
        nonFiction.setName("Non-Fiction");

        genreRepository.saveAll(Arrays.asList(fiction, nonFiction));

        Book book1 = new Book();
        book1.setTitle("The Palace of Illusions");
        book1.setAuthor("Chitra Banerjee");
        book1.setDescription("The novel is a rendition of the Hindu epic Mahabharata as told from Draupadi's viewpoint, namely, that of a woman living in a patriarchal world.");
        book1.setCoverImageUrl("/images/book1.jpg");
        book1.setPrice(319.99);
        book1.setGenre(fiction);
        
        Book book2 = new Book();
        book2.setTitle("A Thousand Splendid Suns");
        book2.setAuthor("Khaled Hosseini");
        book2.setDescription("The primary theme in the novel A Thousand Splendid Suns is the rights of women, especially under the Taliban.");
        book2.setCoverImageUrl("/images/book2.jpg");
        book2.setPrice(399.99);
        book2.setGenre(fiction);
        

        Book book3 = new Book();
        book3.setTitle("Wise and Otherwise");
        book3.setAuthor("Sudha Murthy");
        book3.setDescription(" A Salute to Life is a collection of fifty one short stories based on the real life experiences of Mrs Sudha Murthy. ");
        book3.setCoverImageUrl("/images/book3.jpg");
        book3.setPrice(209.99);
        book3.setGenre(nonFiction);
        
        Book book4 = new Book();
        book4.setTitle("I Came Upon a Lighthouse");
        book4.setAuthor("Shantanu Naidu");
        book4.setDescription("A Short Memoir of Life with Ratan Tata is a memoir written by Shantanu Naidu  ");
        book4.setCoverImageUrl("/images/book4.jpg");
        book4.setPrice(499.99);
        book4.setGenre(nonFiction);
        
        

        bookRepository.saveAll(Arrays.asList(book1, book2,book3,book4));
    }
}
