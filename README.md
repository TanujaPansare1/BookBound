# BookBound

BookBound is a community-driven platform where book enthusiasts can explore, filter, and discover books across various genres. This application allows users to browse books, filter them based on genres, and sort them by price. The project consists of a backend built with Spring Boot and a frontend developed with React.js.

## Features

- **Explore Books**: Browse books across different genres.
- **Genre Filtering**: Filter books by specific genres.
- **Sorting**: Sort books by price.
- **Book Details**: View details of individual books including title, author, and image.

## Tech Stack

### Backend:
- **Spring Boot**: For building the RESTful API.
- **MySQL**: For managing the book and genre data.
  
### Frontend:
- **React.js**: For building the user interface.
- **Vite**: For bundling and serving the React app.
  
### Additional Tools:
- **Maven**: For dependency management and building the backend.
- **Git**: For version control.

## Installation

### Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/TanujaPansare1/BookBound.git
Navigate to the backend directory and install dependencies:
bash
Copy code
cd bookcatalog
mvn clean install
Run the Spring Boot application:
bash
Copy code
mvn spring-boot:run
The backend API should be running on http://localhost:8080.
Frontend
Navigate to the bookcommunity-catalog-react directory:
bash
Copy code
cd bookcommunity-catalog-react
Install the required dependencies:
bash
Copy code
npm install
Start the development server:
bash
Copy code
npm run dev
The frontend should be accessible at http://localhost:3000.


├── vite.config.js
Contributing
Feel free to fork the repository, create a branch for new features, and submit a pull request. Please ensure that your code adheres to the existing coding standards.

License
This project is licensed under the MIT License - see the LICENSE file for details.
