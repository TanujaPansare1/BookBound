const GenreFilter = ({ genres, onSelect }) => {
    return (
      <select onChange={(e) => onSelect(e.target.value)} defaultValue="">
        <option value="">All Genres</option>
        {genres.map((genre) => (
          <option key={genre.id} value={genre.name}>
            {genre.name}
          </option>
        ))}
      </select>
    );
  };
  
  export default GenreFilter;