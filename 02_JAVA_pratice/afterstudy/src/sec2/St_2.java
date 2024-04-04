package sec2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class St_2 {
    public static void main(String[] args) {
        List<BookDto> bookDtoList = new ArrayList<>();

        bookDtoList.add(new BookDto(1,"홍길동전","허균",50000));
        bookDtoList.add(new BookDto(2,"목민심사","정약용",30000));
        bookDtoList.add(new BookDto(3,"동의보감","허준",40000));
        bookDtoList.add(new BookDto(4,"삼국사기","김부식",46000));
        bookDtoList.add(new BookDto(5,"삼국유사","일연",58000));

        for(BookDto x : bookDtoList){
            System.out.println("x = " + x);
        }

        /* 가격 오름차순 정렬 */
        bookDtoList.sort(new AscedingPrice());
        for(BookDto book : bookDtoList){
            System.out.println(book);
        }


        bookDtoList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getPrice() <= o2.getPrice() ? -1 :1 ;
            }
        });

        System.out.println("bookDtoList = " + bookDtoList);
        for(BookDto book : bookDtoList){
            System.out.println(book);
        }




    }
}
