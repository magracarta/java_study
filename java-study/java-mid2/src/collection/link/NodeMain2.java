package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        //노드 생성하고 연결하고 : A->B->C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("노드출력하기");
        System.out.println(first);
        System.out.println(first.next);

    }
}
