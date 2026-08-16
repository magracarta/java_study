package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount >= books.length) {
            System.out.println("도서관 저장공간이 필요합니다.");
            return;
        }
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println(
                    String.format("도서제목 : %s , 저자 : %s",book.title,book.author)
            );
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }


}
