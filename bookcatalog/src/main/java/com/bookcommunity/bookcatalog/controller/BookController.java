package com.bookcommunity.bookcatalog.controller;

import com.bookcommunity.bookcatalog.model.Book;
import com.bookcommunity.bookcatalog.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/genre/{genreId}")
    public List<Book> getBooksByGenre(@PathVariable Long genreId) {
        return bookService.getBooksByGenre(genreId);
    }
}
