package com.bookcommunity.bookcatalog.repository;

import com.bookcommunity.bookcatalog.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    // No additional methods required for now
}
