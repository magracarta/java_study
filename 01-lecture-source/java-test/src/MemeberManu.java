import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemeberManu {
    private  Scanner sc = new Scanner(System.in);
    private MemberManage mm = new MemberManage();

    public void mainmenu(){
        /*
        *
        1. 멤버 추가
        2. 멤버 전제조회
        3. 정렬하여 조회
        sortMenu 메소드
            1. 이름 오름차순 정렬
            2. 주민번호 오름차순 정렬
            3. 이름 내림차순 정렬
            4. 주민번호 내림차순 정렬
        4. 이름으로 검색
        5. 주민번호로 검색
        6. 멤버 수정
        7. 멤버 삭제
        8. 프로그램 종료
        * */
        mainmnu:
        while (true){
            System.out.println("---------회원리스트--------");
            System.out.println("1. 멤버 추가");
            System.out.println("2. 멤버 전제조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 이름으로 검색");
            System.out.println("5. 주민번호로 검색");
            System.out.println("6. 멤버 수정");
            System.out.println("7. 멤버 삭제");
            System.out.println("8. 프로그램 종료");

            System.out.print("manu : ");

            int choice = 99;
            try {
                sc = new Scanner(System.in);
                choice = sc.nextInt();
            }catch (Exception e){
                System.out.println("1~8사이의 숫자만 입력해주세요.");
            }
            switch (choice) {
                case 1 : //멤버 추가
                    memberAdd();
                    break;
                case 2: //멤버 조회
                    memberSelect();
                    break;
                case 3://정렬 조회
                    sortSelect();
                    break;
                case 4: //이름으로 조회
                    nameSearch();
                    break;
                case 5:
                    birthSearch();
                    break;
                case 6:
                    updateMember();
                    break;
                case 7:
                    deleteMember();
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    break mainmnu;
                default:
                    System.out.println("메뉴에 없는 숫자입니다. 1~8사이의 숫자만 입력해주세요.");
            }




        }
    }

    
    //멤버 추가
    public void memberAdd(){
        sc.nextLine();
        System.out.println("멤버의 이름을 작성해주세요.");
        String name = sc.nextLine();
        System.out.println("멤버의 생일을 작성해주세요.");
        int birth = 0;
        try {
            sc = new Scanner(System.in);
            birth = sc.nextInt();
            boolean sucess = mm.addMemberList(new MemberDTO(name ,birth));
            if(sucess){
                System.out.println("멤버를 추가하는데 성공했습니다.");
            }else {
                System.out.println("멤버를 추가하는데 실패했습니다.");
            }
        }catch (Exception e){
            System.out.println("생일에 숫자가 아닌 문자를 입려하였습니다. 멤버등록에 실패하여 메인메뉴로 돌아갑니다.");
        }


    }
    //멤버 조회
    public void memberSelect(){
        List<MemberDTO> selctList = mm.memberListSelect();
        System.out.println("멤버 조회 중");
        if(selctList.size() > 0 ){
            for(MemberDTO m : selctList){
                System.out.println(m);
            }
        }else{
            System.out.println("멤버가 없습니다.");
        }
    }
    
    //정렬하여 조회
    public void sortSelect(){
        if(mm.memberListSelect().size() > 0){
            System.out.println(" ===== 정렬 조회 ==== ");
            System.out.println("1. 이름 오름차순 정렬");
            System.out.println("2. 주민번호 오름차순 정렬");
            System.out.println("3. 이름 내림차순 정렬");
            System.out.println("4. 주민번호 내림차순 정렬");

            int sortChoice =99;
            try {
                sc = new Scanner(System.in);
                sortChoice = sc.nextInt();
            }catch (Exception e){
                System.out.println("메뉴에 없는 숫자입니다. 잘못입력하셔서 메인메뉴로 이동합니다.");
            }
            switch (sortChoice){
                case 1://이름으로 정렬 조회
                    ascSortNameMenu();
                    break;
                case 2:
                    ascSortBirthMenu();
                    break;
                case 3:
                    decSortNameMenu();
                    break;
                case 4:
                    decSortBirthMenu();
                    break;
                default:
                    System.out.println("잘못입력하셔서 메인메뉴로 이동합니다.");
                    break;
            }
        }else System.out.println("0개의 멤버가 존재 합니다. 멤버를 추가해주세요.");


    }

    public void ascSortNameMenu(){
        List<MemberDTO> ascNameList = mm.ascSortnameList();
        System.out.println("===== 이름 오름차순 정렬 =====");
        for(MemberDTO m : ascNameList){
            System.out.println(m);
        }
    }
    public void decSortNameMenu(){
        List<MemberDTO> decNameList = mm.decSortnameList();
        System.out.println("===== 이름 내림차순 정렬 =====");
        for(MemberDTO m : decNameList){
            System.out.println(m);
        }
    }

    //생일 조회
    public void ascSortBirthMenu(){
        List<MemberDTO> ascBirthList = mm.ascSortBirthList();
        System.out.println("===== 생일 올림차순 정렬 =====");
        for(MemberDTO m : ascBirthList){
            System.out.println(m);
        }
    }
    //생일 역순 조회
    public void decSortBirthMenu(){
        List<MemberDTO> decBirthList = mm.decSortBirthList();
        System.out.println("===== 생일 내림차순 정렬 =====");
        for(MemberDTO m : decBirthList){
            System.out.println(m);
        }
    }

    //이름으로 멤버 조회
    public void nameSearch(){
        sc.nextLine();
        System.out.println("조회할 이름을 작성해주세요.");
        String name = sc.nextLine();
        List<MemberDTO> namList = mm.nameSearchList(name);
        if(namList.size() > 0){
            for(MemberDTO m : namList){
                System.out.println(m);
            }
        }else{
            System.out.println("조회 실패 : 이름이 "+name+ "과 알맞는 이름이 없습니다.");
        }

    }

    //생일로 멤버 조회
    public void birthSearch(){
        System.out.println("조회할 생일을 작성해주세요.");
        int birth = sc.nextInt();
        List<MemberDTO> namList = mm.birthSearchList(birth);
        if(namList.size() > 0 ){
            for(MemberDTO m : namList){
                System.out.println(m);
            }
        }else{
            System.out.println("조회 실패 : 생일이 "+birth+ "과 맞는 생일이자가 없습니다.");
        }

    }
    //멤버 수정
    public void updateMember(){
        if(mm.memberListSelect().size()>0){
            System.out.println("수정할 멤버의 id값을 작성해주세요.");
            int updateId;
            try {
                sc = new Scanner(System.in);
                updateId = sc.nextInt();
                sc.nextLine();
                System.out.println("수정할 이름을 작성해주세요.");
                String updateName;
                try {
                    sc = new Scanner(System.in);
                    updateName = sc.nextLine();
                    System.out.println("수정할 생일을 작성해주세요.");
                    int updateBirth = sc.nextInt();

                    boolean update = mm.updateMember(updateId, updateName ,updateBirth);
                    if(!update) System.out.println("업데이트에 실패했습니다. 메인메뉴로 돌아갑니다.");
                }catch (Exception e){
                    System.out.println("생일에 숫자외의 값을 입력했습니다. 메인메뉴로 돌아갑니다.");
                }

            }catch (Exception e){
                System.out.println("id값에 숫자외의 값을 입력했습니다. 메인메뉴로 돌아갑니다.");
            }
        }else{
            System.out.println("멤버리스트가 비었습니다. 멤버를 추가해주세요.");
        }


    }
    
    //멤버 삭제
    public void deleteMember(){
        if(mm.memberListSelect().size()>0){

            System.out.println("삭제할 멤버의 id값을 작성해주세요.");
            int deleteId;
            try {
                sc = new Scanner(System.in);
                deleteId = sc.nextInt();
                boolean delete = mm.deleteMember(deleteId);
                if(!delete) System.out.println("삭제에 실패했습니다. 메인메뉴로 돌아갑니다.");
            }catch (Exception e){
                System.out.println("id값에 숫자외의 값이 들어갔습니다. 메인메뉴로 돌아갑니다.");
            }
        }else{
            System.out.println("멤버리스트가 비었습니다. 멤버를 추가해주세요.");
        }
    }

}
