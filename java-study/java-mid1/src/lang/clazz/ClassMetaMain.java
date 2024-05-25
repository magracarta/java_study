package lang.clazz;

import lang.wrapper.MyIntegerMethodMain1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Calss 조회
        //Class clazz = String.class; // 1. 클래스에서 조회

        //Class clazz = new String().getClass(); //2.인스턴스에서 조회
        Class clazz = Class.forName("java.lang.String"); //3. 문자열로 조회


        //모든 필드 출력
        Field[] fileds = clazz.getDeclaredFields();

        for(Field field : fileds){
            System.out.println("filed = "+field.getType() + " " + field.getName());
        }
        //모든 메서드 출력

       Method[] mehods = clazz.getDeclaredMethods();

        for(Method mehod : mehods){
            System.out.println("mehod = "+mehod);
        }

        //상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for(Class anInterfce : interfaces){
            System.out.println("Interface : "+anInterfce);
        }

        Class clazz2 = MyIntegerMethodMain1.class;

        Method [] mehods2 = clazz2.getDeclaredMethods();

        System.out.println("???");
        for(Method mehod : mehods2){
            System.out.println("mehod = "+mehod);
        }



    }
}
