package com.bookcommunity.bookcatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String description;
    private String coverImageUrl;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    @JsonIgnore // Prevents circular reference during serialization
    private Genre genre;

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public Genre getGenre() {
        return genre;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
