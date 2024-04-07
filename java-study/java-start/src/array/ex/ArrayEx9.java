package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static Scanner sc = new Scanner(System.in);
    public static int count = 10;
    public static int productCount = 0;
    public static String[] productName = new String[count];
    public static int[] price = new int[count];

    public static void main(String[] args) {
        close:
        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int choice = 0;

            try {
                choice = sc.nextInt();
            }catch (Exception e) {
                sc = new Scanner(System.in);
                System.out.println("문자를 입력했습니다!");
            }

            switch (choice){
                case 1 :
                    ArrayEx9.productAdd();
                    break;
                case 2 :
                    getCount();
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    break close;
                default:
                    System.out.println("1~3번 사이의 숫자만 입력해주세요.");
            }
        }
    }

    public static void productAdd(){
        if(productCount < count){
            System.out.println("상품 이름을 입력하세요 :");
            sc.nextLine();
            productName[productCount] = sc.nextLine();
            System.out.println("상품 가격을 입력하세요 : ");
            price[productCount++] = sc.nextInt();
        }else System.out.println("이미 상품 "+count+"개를 모두 담았습니다.");
    }

    public static void getCount() {
        for (int i = 0; i < productCount; i++){
            System.out.println(productName[i] + ": "+price[i]);
        }
    }
}
