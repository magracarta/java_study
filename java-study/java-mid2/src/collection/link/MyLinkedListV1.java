package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object o){
        Node newNode = new Node(o);
        if(first ==null)first = newNode;
        else {
            Node lastNode= getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index , Object element){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    private Node getNode(int index) {
    }
}
