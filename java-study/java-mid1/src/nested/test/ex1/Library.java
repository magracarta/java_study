package nested.test.ex1;

import java.awt.print.Book;
import java.util.LinkedHashMap;
import java.util.Map;

public class Library {
    private int booknum;
    Book boock = new Book();
    Map<String , String> booklist = new LinkedHashMap<>();

    public Library(int num) {
        this.booknum = num;
    }

    private class Book{
        public void addBook(String title, String author){
            if(booknum <= booklist.size()) {
                System.out.println("도서관 저장 공간이 부족합니다.");
                return;
            }
            booklist.put(title , author);
        }
    }


    public void addBook(String title, String author){
       boock.addBook(title, author);
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        booklist.forEach( (title,author) ->{ System.out.printf("도서 제목: %s, 저자: %s%n", title, author);});
    }

}
