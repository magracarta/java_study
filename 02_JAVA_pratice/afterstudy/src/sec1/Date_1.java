package sec1;

import java.util.Date;

public class Date_1 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("today = "+ today);

        System.out.println("today.getTime() = "+ today.getTime());



        Date Time = new Date(today.getTime());

        System.out.println(Time.getYear());
        System.out.println(Time.getMonth());
        System.out.println(Time.getDate());
        System.out.println(Time.getDay());

    }
}
