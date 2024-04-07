package TestStudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicManager {
    private List<MusicDTO> musicList = new ArrayList<MusicDTO>();

    //곡추가
    public void add(MusicDTO music){
        musicList.add(music);
    }

    //곡조회
    public List<MusicDTO> selctList(){
        return musicList;
    }

    //가수명으로 정렬 조회
    public List<MusicDTO> artistSortList(){
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);

        sortList.sort(new Comparator<MusicDTO>() {
            @Override
            public int compare(MusicDTO o1, MusicDTO o2) {
                return o1.getArtist().compareTo(o2.getArtist());
            }
        });
        return sortList;
    }
    //곡명으로 정렬 조회
    public List<MusicDTO> titleSortList(){
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);
        sortList.sort(new AscMusicTitle());

        return sortList;
    }
    //가수명으로 역순 조회
    public List<MusicDTO> reverseAtistList(){
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);
        sortList.sort(new DescArtist());
        return sortList;
    }
    //곡명으로 역순조회
    public List<MusicDTO> reverseTitleList(){
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);
        sortList.sort(new Comparator<MusicDTO>() {
            @Override
            public int compare(MusicDTO o1, MusicDTO o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        return sortList;
    }
    //가수명으로 노래조회
    public List<MusicDTO> artistSearchLsit(String artist){
        List<MusicDTO> artistArray = new ArrayList<>();
        for(int i = 0; i < musicList.size(); i++){
            if(musicList.get(i).getArtist() == artist){
                artistArray.add(musicList.get(i));
            }
        }
        return artistArray;
    }
    //타이틀로 노래조회
    public List<MusicDTO> titleSearchLsit(String title){
        List<MusicDTO> titleArray = new ArrayList<>();
        for(int i = 0; i < musicList.size(); i++){
            if(musicList.get(i).getArtist() == title){
                titleArray.add(musicList.get(i));

            }
        }
        return titleArray;
    }
    //곡 삭제
    public boolean removeMusic(int id){
        MusicDTO removeMusic;
        for(int i = 0; i < musicList.size(); i++){
            if(musicList.get(i).getId() == id){
                removeMusic = musicList.remove(i);
                System.out.println(removeMusic);
                return true;
            }
        }
        return false;
    }
    //곡 수정
    public boolean updateMusic(int id , String tile, String artist ){
        MusicDTO old ;
        for(int i = 0; i < musicList.size(); i++){
            if(musicList.get(i).getId() == id){
                old = musicList.set(i, new MusicDTO(id, tile, artist));

                System.out.println(old + "->" + new MusicDTO(id, tile, artist) );
                return true;
            }
        }
        return false;
    }
}
