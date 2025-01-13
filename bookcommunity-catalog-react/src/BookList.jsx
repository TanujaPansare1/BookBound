import React from 'react';

const BookList = ({ books }) => {
  return (
    <div className="row">
      {books.map((book) => (
        <div className="col-lg-4 col-md-6 col-sm-12 mb-4" key={book.id}>
          <div className="card h-100">
            {/* Use the book's coverImageUrl dynamically */}
            <img
              src={`http://localhost:8080${book.coverImageUrl}`}
              className="card-img-top"
              alt={book.title}
            />
            <div className="card-body">
              <h5 className="card-title">{book.title}</h5>
              <p className="card-text">{book.description}</p>
              <p className="card-text">
                <strong>Price: </strong>${book.price}
              </p>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default BookList;
