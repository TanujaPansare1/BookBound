import React, { useState, useEffect } from 'react';
import './App.css'; // Add custom styles if needed
import GenreFilter from './GenreFilter'; // Ensure this is the correct path
import BookList from './BookList'; // Ensure this is the correct path

const App = () => {
  const [books, setBooks] = useState([]);
  const [genres, setGenres] = useState([]);
  const [selectedGenre, setSelectedGenre] = useState('');
  const [searchTerm, setSearchTerm] = useState('');
  const [sortOrder, setSortOrder] = useState('asc');

  useEffect(() => {
    const fetchBooks = async () => {
      let url = 'http://localhost:8080/api/books';
      if (selectedGenre) {
        const selectedGenreId = genres.find(
          (genre) => genre.name.toLowerCase() === selectedGenre.toLowerCase()
        )?.id;
        if (selectedGenreId) {
          url = `http://localhost:8080/api/books/genre/${selectedGenreId}`;
        }
      }

      const booksResponse = await fetch(url);
      const booksData = await booksResponse.json();
      setBooks(booksData);
    };

    const fetchGenres = async () => {
      const genresResponse = await fetch('http://localhost:8080/api/genres');
      const genresData = await genresResponse.json();
      setGenres(genresData);
    };

    fetchBooks();
    fetchGenres();
  }, [selectedGenre, genres]);

  // Filter the books based on the search term and sort order
  const filteredBooks = books
    .filter((book) =>
      book.title.toLowerCase().includes(searchTerm.toLowerCase()) // Case-insensitive search
    )
    .sort((a, b) =>
      sortOrder === 'asc' ? a.price - b.price : b.price - a.price
    );

  return (
    <div className="container">
      <h1 className="my-4">Book Catalog</h1>

      {/* Filter and Search Section */}
      <div className="row align-items-center mb-4">
        <div className="col-md-3 col-sm-12 mb-2">
          <GenreFilter genres={genres} onSelect={setSelectedGenre} />
        </div>
        <div className="col-md-5 col-sm-12 mb-2">
          <input
            type="text"
            className="form-control"
            placeholder="Search by title"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
          />
        </div>
        <div className="col-md-4 col-sm-12 mb-2">
          <button
            className="btn btn-primary w-100"
            onClick={() => setSortOrder(sortOrder === 'asc' ? 'desc' : 'asc')}
          >
            Sort by Price ({sortOrder === 'asc' ? 'Low to High' : 'High to Low'})
          </button>
        </div>
      </div>

      {/* Display Book List */}
      <div>
        {filteredBooks.length ? (
          <BookList books={filteredBooks} />
        ) : (
          <p>No books found matching your criteria.</p>
        )}
      </div>
    </div>
  );
};

export default App;
