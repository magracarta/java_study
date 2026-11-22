package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> browserHistory = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String s) {
        if(currentPage != null) {
            browserHistory.offerFirst(currentPage);
        }
        System.out.println("방문 : "+ s);
        currentPage = s;
    }

    public String goBack() {
        String string = browserHistory.pollFirst();
        System.out.println("뒤로가기 :" +string);
        return string;
    }
}
