package com.bookcommunity.bookcatalog.service;
import com.bookcommunity.bookcatalog.model.Book;
import com.bookcommunity.bookcatalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByGenre(Long genreId) {
        return bookRepository.findByGenreId(genreId);
    }
}
