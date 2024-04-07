package TestStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicManu {
    MusicManager mm = new MusicManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
     /*
                메뉴
                1. 곡 추가
                2. 곡 전제조회
                3. 정렬하여 조회
                sortMenu 메소드
                    1. 가수명 오름차순 정렬
                    2. 곡명 오름차순 정렬
                    3. 가수명 내림차순 정렬
                    4. 곡명 내림차순 정렬
                    메뉴 선택 :
                    scaner int
                    올림내림차순 이동(menu)
                4. 가수명으로 검색
                5. 곡명으로 검색
                6. 곡 정보 수정
                7. 곡 삭제
                8. 프로그램 종료
            * */
        mainManu:
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
            System.out.print("메뉴 : ");
            int choice = 88;
            try {
                sc = new Scanner(System.in);
                choice = sc.nextInt();
            }catch (Exception e){
                choice = 99;
            }

            switch(choice){
                case 1: //곡 추가
                    sc.nextLine();
                    System.out.print("곡명을 작성해주세요.");
                    String musicName = sc.nextLine();
                    System.out.print("가수명을 작성해주세요.");
                    String musicArtist = sc.nextLine();
                    addList(musicName,musicArtist);
                    break ;
                case 2: //곡 전체 조회
                    musicSelec();
                    break ;
                case 3:
                    if(mm.artistSortList().size() > 0) musicSortSlect();
                    else  System.out.println("곡이 0개입니다. 곡을 추가해주세요.");
                    break ;
                case 4:
                    sc.nextLine();
                    aritstSearch();
                    break ;
                case 5:
                    sc.nextLine();
                    titleSearch();
                    break ;
                case 6:
                    updateMusic();
                    break ;
                case 7:
                    removeMusic();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break mainManu;
                default:
                    System.out.println("0~7사이의 숫자만 입력해주세요.");
                    break;
            }
        }

    }

    //곡 추가
    public void addList(String musicName, String musicArtist){
        MusicDTO music = new MusicDTO(musicName,musicArtist);
        mm.add(music);
        System.out.println("음악을 추가했습니다.");
        System.out.println(music);
    }

    //곡 조회하기
    public void musicSelec(){
        List<MusicDTO> musicList =mm.selctList();
        if(musicList.size() > 0){
            for (MusicDTO music : musicList){
                System.out.println(music);
            }
        }else{
            System.out.println("곡이 0개입니다. 곡을 추가해주세요.");
        }
    }
    //곡을 정렬하여 조회하기
    public void musicSortSlect(){
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int sortChoice = sc.nextInt();
        List<MusicDTO> musicList = new ArrayList<>();
        switch(sortChoice){
            case 1:
                musicList = ascArtist();
                break;
            case 2:
                musicList = ascTitle();
                break;
            case 3:
                musicList = descArtist();
                break;
            case 4:
                musicList = descTitle();
                break;
            default:
                System.out.println("1~4 번 사이의 번호만 작성해주세요.");
                break;
        }
        for (MusicDTO music : musicList){
            System.out.println(music);
        }
    }
    //가수명으로 조회
    public List<MusicDTO>  ascArtist(){
        System.out.println("가수명 오름차순 조회");
        return mm.artistSortList();
        
    }
    //곡명으로 오름차순 조회
    public List<MusicDTO> ascTitle(){
        System.out.println("타이틀으로 오름차순 조회");
        return mm.titleSortList();
    }
    //가수명으로 역순조회
    public List<MusicDTO> descTitle(){
        System.out.println("타이틀으로 내림차순 조회");
        return   mm.reverseTitleList();

    }
    //곡명으로 역순조회
    public List<MusicDTO> descArtist(){
        System.out.println("가수명 내림차순 조회");
         return mm.reverseAtistList();
    }

    //가수명으로 검색
    public void aritstSearch(){
        System.out.print("가수명을 적어주세요.");
        String artist = sc.nextLine();
        List<MusicDTO> artistList = mm.artistSearchLsit(artist);

        for(int i=0;i<artistList.size();i++){
            System.out.println(artistList.get(i));
        }
    }

    //타이틀 검색
    public void titleSearch(){
        System.out.print("곡명을 적어주세요.");
        String title = sc.nextLine();
        List<MusicDTO> titleList = mm.titleSearchLsit(title);

        for(int i=0;i<titleList.size();i++){
            System.out.println(titleList.get(i));
        }
    }
    //곡 삭제
    public void removeMusic(){
        System.out.print("id값을 적어주세요.");
        int removeId = sc.nextInt();
        boolean removeMusic = mm.removeMusic(removeId);
        if(removeMusic){
            System.out.println("곡을 성공적으로 삭제했습니다.");
        }else{
            System.out.println("일치하는 곡이 없습니다.");
        }
    }
    
    //곡 수정
    public void updateMusic(){
        System.out.print("수정할 곡의 id값을 적어주세요.");
        int upateId = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 곡 이름을 적어주세요.");
        String updateTile = sc.nextLine();
        System.out.print("수정할 가수명을 적어주세요");
        String updateArtist = sc.nextLine();

        boolean updateMusic = mm.updateMusic(upateId , updateTile ,updateArtist);
        if(updateMusic){
            System.out.println("곡이 수정되었습니다.");
        }else{
            System.out.println("일치하는 곡이 없습니다.");
        }

    }
}
