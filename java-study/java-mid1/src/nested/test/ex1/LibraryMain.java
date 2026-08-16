package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1","저자1");
        library.addBook("책2","저자2");
        library.addBook("책3","저자3");
        library.addBook("one more thing","잡스");
        library.addBook("의문의 책 +1","누구냐");
        library.showBooks();
    }
}
