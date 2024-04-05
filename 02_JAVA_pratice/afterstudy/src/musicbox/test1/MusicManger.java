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


}
