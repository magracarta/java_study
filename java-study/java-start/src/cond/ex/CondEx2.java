package cond.ex;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 150;
        String move;

        if(distance <= 1){
            move = "도보";
        }else if(distance <= 10){
            move = "자전거";
        }else if(distance <= 100){
            move = "자동차";
        } else {
            move = "비행기";
        }

        System.out.println(move+"를 이용하세요.");
    }
}
