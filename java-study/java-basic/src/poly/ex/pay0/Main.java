package poly.ex.pay0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        char tmep;
        for(int i = 0; i < a.length(); i++) {
            tmep = (a.charAt(i));
            int origin = tmep;
            String orignalText = a.valueOf(tmep).toUpperCase();
            char aftertext = orignalText.charAt(orignalText.length() - 1);

            if(origin == aftertext){
                output += a.valueOf(tmep).toLowerCase();
            }else{
                output += a.valueOf(tmep).toUpperCase();
            }
        }

        System.out.println(output);
    }
}
