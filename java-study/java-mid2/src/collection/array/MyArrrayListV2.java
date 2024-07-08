package collection.array;

import java.util.Arrays;

public class MyArrrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementsData;
    private int size =0;

    public MyArrrayListV2() {
        elementsData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrrayListV2(int initialCapacity){
        elementsData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        //코드 추가
        if(size == elementsData.length){
            gorw();
        }
        elementsData[size] = e;
        size++;
    }

    private void gorw() {
        int oldCapacity = elementsData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열을 복사
        elementsData = Arrays.copyOf(elementsData, newCapacity);
    }

    public Object get(int index){
        return elementsData[index];
    }
    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementsData[index] = element;

        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementsData[i])){
                return i;
            }
        }
        return -1;
    }


    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementsData, size)) + ",size = "
                + size +", capacity = "+elementsData.length;
    }
}
