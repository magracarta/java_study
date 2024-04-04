package sec2;

import java.util.Comparator;

public class AscedingPrice implements Comparator<BookDto> {

    @Override
    public int compare(BookDto o1, BookDto o2) {
        int result = 0;
        if(o1.getNumber() < o2.getNumber()){
            result = 1;
        }else if(o1.getNumber() > o2.getNumber()){
            result = -1;
        }else {
            result = 0;
        }
        return result;
    }
}
