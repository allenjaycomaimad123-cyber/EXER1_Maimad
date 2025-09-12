public class LibraryList {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy");
        library.addBook("1984", "George Orwell", 1949, "Dystopian");
        library.addBook("To Kill a Mockingbird", "Harper Lee", 1960, "Drama");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");
        library.addBook("Moby-Dick", "Herman Melville", 1851, "Adventure");

        System.out.println("Book List:");
        library.displayBooks();
    }
}
