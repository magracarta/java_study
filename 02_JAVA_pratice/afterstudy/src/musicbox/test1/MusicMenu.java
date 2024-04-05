package musicbox.test1;
import java.util.*;

public class MusicMenu {
        Scanner sc = new Scanner(System.in);
        MusicManger musicManager = new MusicManger();

    public void mainMnu(){

        mainMenu:
        while (true){
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명으로 검색");
            System.out.println("5. 곡명으로 검색");
            System.out.println("6. 곡 정보 수정");
            System.out.println("7. 곡 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
           int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1 :
                    musicAdd();
                    break;
                case 2 :
                    musicSelect();
                    break;
                case 3 :
                    acsdcsSort();
                    break;
                case 0 :
                    System.out.println("시스템을 종료합니다.");
                    break mainMenu;
            }

        }
    }

    public void musicAdd(){
        System.out.println("가수명을 적어주세요.");
        String artist = sc.nextLine();
        System.out.println("곡명을 적오주세요.");
        String title = sc.nextLine();
        musicManager.addList(new MusicDto(artist,title));
    }

    public void musicSelect(){
        System.out.println("곡 전체 조회 ==== ");
        List<MusicDto> selectList = musicManager.selectList();
        for(MusicDto music : selectList){
            System.out.println(music);
        }
    }

    public void acsdcsSort(){
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴선택");

        int sortmenu = sc.nextInt();

        ascDec(sortmenu);
    }

    public void ascDec(int menu){
        List<MusicDto> sorList = new LinkedList<>();
        sorList.addAll(musicManager.selectList());

        if(menu == 1){
            sorList.sort(new Comparator<MusicDto>() {
                @Override
                public int compare(MusicDto o1, MusicDto o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }
            });
        } else if (menu == 2) {
            sorList.sort(new AscTitle());
        } else if (menu == 3) { //3. 가수명 내림차순 정렬
            sorList.sort(new DscArtist());
        }else {//4. 곡명 내림차순 정렬
            sorList.sort(new DscTitle());
        }

        for(int i =0; i < sorList.size(); i++){
            System.out.println(sorList.get(i));
        }
    }

}
