package nested.test.ex1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library2 {
    private  Book [] books;
    private  int bookCount;

    public Library2(int size) {
        books = new Book[size];
        bookCount = 0;
    }
    
    private static class Book{
        private String title;
        private String author;

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }
    }


    public void addBook(String title, String author){
        if(bookCount >= 4) System.out.println("도서관 저장 공간이 부족합니다.");
        else books[bookCount++] = new Book(title, author);

    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: "+books[i].title + ", 저자: "+books[i].author);
        }
    }


}
