package collection.array;

import java.util.Arrays;

public class MyArrrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementsData;
    private int size =0;

    public MyArrrayListV3() {
        elementsData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrrayListV3(int initialCapacity){
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

    //코드추가
    public void add(int index, Object e){
        if(size == elementsData.length){
            gorw();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementsData[index] = e;
        size++;
    }

    //코드 추가, 요소의 마지막 부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementsData[i] = elementsData[i - 1];
        }
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
    //코드추가
    public Object remove(int index){
        Object oldvalue = get(index);
        shiftLeftFrom(index);
        size--;
        elementsData[size] = null;
        return oldvalue;
    }

    //코드 추가 요소의 index부터 마지막 까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for(int i = index; i < size -1; i++){
            elementsData[i] = elementsData[i+1];
        }
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
