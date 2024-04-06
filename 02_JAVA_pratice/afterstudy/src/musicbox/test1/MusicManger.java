package musicbox.test1;


import java.util.ArrayList;
import java.util.List;

public class MusicManger {
    private List<MusicDto> musicList = new ArrayList<>();

    //곡추가
    public void addList(MusicDto music){
        musicList.add(music);
    }

    //곡 전체 조회
    public List<MusicDto> selectList(){
        return musicList;
    }

    //가수명으로 노래 조회
    public List<MusicDto> aritstList(String artist){
        List<MusicDto> aristList = new ArrayList<>();
        for (MusicDto x : musicList){
         if(x.getArtist().contains(artist)){
             aristList.add(x);
         }
        }
        return aristList;
    }

    //노래 제목으로 곡조회
    public List<MusicDto> titleList(String tilte){
        List<MusicDto> tilteList = new ArrayList<>();

        for(MusicDto music: musicList){
            if(music.getTitle().contains(tilte)) tilteList.add(music);

        }

        return tilteList;
    }

    //id값으로 곡 수정
    public Boolean musicUpdate(int id , String artist, String title){

        MusicDto old = null;
        MusicDto music = new MusicDto(id, artist, title);

        for(int i = 0; i < musicList.size(); i++){
            if(musicList.get(i).getId() == id){
                old = musicList.set(i, music);
            }
        }

     System.out.println(music);

        return old != null;
    }



}
