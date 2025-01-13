package com.bookcommunity.bookcatalog.service;
import com.bookcommunity.bookcatalog.model.Genre;
import com.bookcommunity.bookcatalog.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
