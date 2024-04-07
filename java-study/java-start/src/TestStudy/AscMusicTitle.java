package TestStudy;

import java.util.Comparator;

public class AscMusicTitle implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
